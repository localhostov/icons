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

public val Icons.Bold.Ballot: ImageVector
    get() {
        if (_ballot != null) {
            return _ballot!!
        }
        _ballot = Builder(name = "Ballot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 0.0f)
                lineTo(7.5f, 0.0f)
                curveTo(4.467f, 0.0f, 2.0f, 2.467f, 2.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(22.0f, 5.5f)
                curveToRelative(0.0f, -3.033f, -2.467f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(19.0f, 18.5f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                lineTo(7.5f, 21.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                lineTo(5.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(17.0f, 6.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.972f, -0.033f, -1.971f, -2.967f, 0.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(17.0f, 11.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.972f, -0.033f, -1.971f, -2.967f, 0.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(17.0f, 16.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.972f, -0.033f, -1.971f, -2.967f, 0.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(10.0f, 6.5f)
                curveToRelative(-0.034f, 1.972f, -2.967f, 1.971f, -3.0f, 0.0f)
                curveToRelative(0.034f, -1.972f, 2.967f, -1.971f, 3.0f, 0.0f)
                close()
                moveTo(10.0f, 11.5f)
                curveToRelative(-0.034f, 1.972f, -2.967f, 1.971f, -3.0f, 0.0f)
                curveToRelative(0.034f, -1.972f, 2.967f, -1.971f, 3.0f, 0.0f)
                close()
                moveTo(10.0f, 16.5f)
                curveToRelative(-0.034f, 1.972f, -2.967f, 1.971f, -3.0f, 0.0f)
                curveToRelative(0.034f, -1.972f, 2.967f, -1.971f, 3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _ballot!!
    }

private var _ballot: ImageVector? = null
