package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.RubleSign: ImageVector
    get() {
        if (_rubleSign != null) {
            return _rubleSign!!
        }
        _rubleSign = Builder(name = "RubleSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 15.0f)
                curveToRelative(9.929f, -0.353f, 9.922f, -14.65f, 0.0f, -15.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, 2.468f, -5.5f, 5.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.972f, 0.034f, -1.971f, 2.967f, 0.0f, 3.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.972f, 0.034f, -1.971f, 2.967f, 0.0f, 3.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.034f, 1.972f, 2.967f, 1.971f, 3.0f, 0.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.972f, -0.034f, 1.971f, -2.967f, 0.0f, -3.0f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.5f)
                close()
                moveTo(8.0f, 5.5f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(5.935f, 0.156f, 5.931f, 8.846f, 0.0f, 9.0f)
                horizontalLineToRelative(-6.5f)
                verticalLineTo(5.5f)
                close()
            }
        }
        .build()
        return _rubleSign!!
    }

private var _rubleSign: ImageVector? = null
