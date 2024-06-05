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

public val Icons.Outline.SmartHome: ImageVector
    get() {
        if (_smartHome != null) {
            return _smartHome!!
        }
        _smartHome = Builder(name = "SmartHome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.083f, 6.564f)
                lineTo(15.083f, 1.08f)
                curveToRelative(-1.815f, -1.422f, -4.352f, -1.422f, -6.167f, 0.0f)
                lineTo(1.917f, 6.564f)
                curveToRelative(-1.218f, 0.953f, -1.917f, 2.388f, -1.917f, 3.936f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0.0f, -1.548f, -0.699f, -2.982f, -1.917f, -3.936f)
                close()
                moveTo(22.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0.0f, -0.929f, 0.419f, -1.789f, 1.15f, -2.361f)
                lineToRelative(7.0f, -5.484f)
                curveToRelative(0.545f, -0.427f, 1.197f, -0.64f, 1.85f, -0.64f)
                reflectiveCurveToRelative(1.306f, 0.213f, 1.85f, 0.64f)
                lineToRelative(7.0f, 5.484f)
                curveToRelative(0.731f, 0.572f, 1.15f, 1.433f, 1.15f, 2.361f)
                verticalLineToRelative(8.5f)
                close()
                moveTo(13.5f, 17.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(15.536f, 13.465f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-1.17f, -1.17f, -3.073f, -1.17f, -4.243f, 0.0f)
                curveToRelative(-0.391f, 0.391f, -1.023f, 0.391f, -1.414f, 0.0f)
                reflectiveCurveToRelative(-0.391f, -1.023f, 0.0f, -1.414f)
                curveToRelative(1.949f, -1.949f, 5.122f, -1.949f, 7.071f, 0.0f)
                close()
                moveTo(18.364f, 10.636f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-2.729f, -2.729f, -7.17f, -2.729f, -9.899f, 0.0f)
                curveToRelative(-0.391f, 0.391f, -1.023f, 0.391f, -1.414f, 0.0f)
                reflectiveCurveToRelative(-0.391f, -1.023f, 0.0f, -1.414f)
                curveToRelative(3.509f, -3.51f, 9.219f, -3.51f, 12.728f, 0.0f)
                close()
            }
        }
        .build()
        return _smartHome!!
    }

private var _smartHome: ImageVector? = null
