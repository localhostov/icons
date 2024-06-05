package me.localx.icons.rounded.outline

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

public val Icons.Outline.DesktopArrowDown: ImageVector
    get() {
        if (_desktopArrowDown != null) {
            return _desktopArrowDown!!
        }
        _desktopArrowDown = Builder(name = "DesktopArrowDown", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                lineTo(2.0f, 13.0f)
                verticalLineToRelative(-6.978f)
                curveToRelative(0.0f, -0.804f, 0.314f, -1.56f, 0.885f, -2.127f)
                curveToRelative(0.566f, -0.563f, 1.317f, -0.873f, 2.115f, -0.873f)
                horizontalLineToRelative(0.017f)
                lineToRelative(2.978f, 0.017f)
                horizontalLineToRelative(0.006f)
                curveToRelative(0.55f, 0.0f, 0.997f, -0.444f, 1.0f, -0.995f)
                curveToRelative(0.003f, -0.552f, -0.442f, -1.002f, -0.994f, -1.005f)
                lineToRelative(-2.978f, -0.017f)
                horizontalLineToRelative(-0.028f)
                curveToRelative(-1.331f, 0.0f, -2.582f, 0.516f, -3.525f, 1.455f)
                curveToRelative(-0.951f, 0.945f, -1.475f, 2.204f, -1.475f, 3.545f)
                verticalLineToRelative(7.978f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.001f, 6.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(19.0f, 17.0f)
                lineTo(5.0f, 17.0f)
                curveToRelative(-1.302f, 0.0f, -2.402f, -0.839f, -2.816f, -2.0f)
                horizontalLineToRelative(19.631f)
                curveToRelative(-0.414f, 1.161f, -1.514f, 2.0f, -2.816f, 2.0f)
                close()
                moveTo(11.0f, 8.42f)
                lineTo(11.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(7.421f)
                lineToRelative(2.319f, -2.154f)
                curveToRelative(0.403f, -0.375f, 1.038f, -0.354f, 1.413f, 0.053f)
                curveToRelative(0.376f, 0.405f, 0.353f, 1.037f, -0.052f, 1.413f)
                lineToRelative(-2.613f, 2.426f)
                curveToRelative(-0.561f, 0.561f, -1.308f, 0.843f, -2.058f, 0.843f)
                curveToRelative(-0.76f, 0.0f, -1.523f, -0.289f, -2.104f, -0.869f)
                lineToRelative(-2.587f, -2.4f)
                curveToRelative(-0.404f, -0.376f, -0.428f, -1.008f, -0.052f, -1.413f)
                curveToRelative(0.374f, -0.406f, 1.009f, -0.428f, 1.413f, -0.053f)
                lineToRelative(2.319f, 2.153f)
                close()
            }
        }
        .build()
        return _desktopArrowDown!!
    }

private var _desktopArrowDown: ImageVector? = null
