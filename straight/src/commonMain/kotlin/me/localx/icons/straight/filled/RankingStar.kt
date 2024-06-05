package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.RankingStar: ImageVector
    get() {
        if (_rankingStar != null) {
            return _rankingStar!!
        }
        _rankingStar = Builder(name = "RankingStar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 24.0f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(9.345f, 7.564f)
                lineToRelative(0.48f, 0.362f)
                lineToRelative(2.183f, -1.687f)
                lineToRelative(2.173f, 1.68f)
                lineToRelative(0.504f, -0.349f)
                lineToRelative(-0.884f, -2.686f)
                lineToRelative(2.197f, -1.273f)
                verticalLineToRelative(-0.611f)
                horizontalLineToRelative(-2.883f)
                lineToRelative(-0.784f, -3.0f)
                horizontalLineToRelative(-0.648f)
                lineToRelative(-0.784f, 3.0f)
                horizontalLineToRelative(-2.899f)
                verticalLineToRelative(0.615f)
                lineToRelative(2.212f, 1.231f)
                lineToRelative(-0.869f, 2.717f)
                close()
                moveTo(4.5f, 13.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(13.5f, 9.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-13.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _rankingStar!!
    }

private var _rankingStar: ImageVector? = null
