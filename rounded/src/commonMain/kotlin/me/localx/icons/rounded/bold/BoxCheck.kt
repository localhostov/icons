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

public val Icons.Bold.BoxCheck: ImageVector
    get() {
        if (_boxCheck != null) {
            return _boxCheck!!
        }
        _boxCheck = Builder(name = "BoxCheck", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.107f, 12.488f)
                curveToRelative(0.559f, 0.612f, 0.516f, 1.561f, -0.096f, 2.119f)
                lineToRelative(-3.74f, 3.414f)
                curveToRelative(-0.611f, 0.614f, -1.49f, 0.979f, -2.425f, 0.979f)
                reflectiveCurveToRelative(-1.814f, -0.364f, -2.475f, -1.025f)
                lineToRelative(-1.425f, -1.407f)
                curveToRelative(-0.59f, -0.582f, -0.596f, -1.532f, -0.014f, -2.121f)
                curveToRelative(0.582f, -0.592f, 1.531f, -0.598f, 2.121f, -0.014f)
                lineToRelative(1.432f, 1.414f)
                curveToRelative(0.134f, 0.135f, 0.283f, 0.153f, 0.36f, 0.153f)
                reflectiveCurveToRelative(0.226f, -0.019f, 0.353f, -0.146f)
                lineToRelative(3.789f, -3.461f)
                curveToRelative(0.612f, -0.558f, 1.56f, -0.516f, 2.119f, 0.096f)
                close()
                moveTo(24.0f, 6.5f)
                curveToRelative(0.0f, 0.951f, -0.382f, 1.815f, -1.0f, 2.447f)
                verticalLineToRelative(9.553f)
                curveToRelative(0.0f, 3.032f, -2.468f, 5.5f, -5.5f, 5.5f)
                lineTo(6.5f, 24.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                lineTo(1.0f, 8.947f)
                curveToRelative(-0.618f, -0.632f, -1.0f, -1.495f, -1.0f, -2.447f)
                verticalLineToRelative(-1.0f)
                curveTo(0.0f, 2.468f, 2.467f, 0.0f, 5.5f, 0.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.468f, 5.5f, 5.5f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(3.0f, 6.5f)
                curveToRelative(0.0f, 0.275f, 0.224f, 0.5f, 0.5f, 0.5f)
                lineTo(20.5f, 7.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, -0.225f, 0.5f, -0.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.379f, -1.121f, -2.5f, -2.5f, -2.5f)
                lineTo(5.5f, 3.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(20.0f, 18.5f)
                lineTo(20.0f, 10.0f)
                lineTo(4.0f, 10.0f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _boxCheck!!
    }

private var _boxCheck: ImageVector? = null
