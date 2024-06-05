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

public val Icons.Outline.Axe: ImageVector
    get() {
        if (_axe != null) {
            return _axe!!
        }
        _axe = Builder(name = "Axe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.53f, 6.77f)
                curveToRelative(-0.353f, -0.421f, -0.87f, -0.681f, -1.418f, -0.713f)
                curveToRelative(-0.759f, -0.045f, -2.074f, -0.214f, -2.927f, -0.828f)
                lineToRelative(1.521f, -1.521f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(-1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-1.542f, 1.542f)
                lineToRelative(-1.946f, -1.952f)
                curveToRelative(-0.566f, -0.569f, -1.32f, -0.882f, -2.123f, -0.883f)
                horizontalLineToRelative(-0.003f)
                curveToRelative(-0.801f, 0.0f, -1.554f, 0.312f, -2.121f, 0.879f)
                lineToRelative(-1.678f, 1.678f)
                curveToRelative(-1.167f, 1.167f, -1.169f, 3.068f, -0.004f, 4.239f)
                lineToRelative(1.955f, 1.961f)
                lineTo(0.293f, 21.293f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(11.511f, -11.511f)
                curveToRelative(0.608f, 0.849f, 0.783f, 2.167f, 0.832f, 2.929f)
                curveToRelative(0.036f, 0.545f, 0.296f, 1.059f, 0.716f, 1.409f)
                curveToRelative(0.362f, 0.302f, 0.821f, 0.466f, 1.289f, 0.466f)
                curveToRelative(4.195f, -0.482f, 7.446f, -3.517f, 7.932f, -7.71f)
                curveToRelative(0.063f, -0.545f, -0.103f, -1.099f, -0.456f, -1.52f)
                close()
                moveTo(16.046f, 13.996f)
                curveToRelative(-0.09f, -1.388f, -0.451f, -3.297f, -1.656f, -4.502f)
                lineToRelative(-3.099f, -3.109f)
                curveToRelative(-0.388f, -0.39f, -0.388f, -1.024f, 0.001f, -1.413f)
                lineToRelative(1.678f, -1.678f)
                curveToRelative(0.189f, -0.189f, 0.44f, -0.293f, 0.708f, -0.293f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.268f, 0.0f, 0.519f, 0.105f, 0.708f, 0.295f)
                lineToRelative(3.094f, 3.104f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(1.217f, 1.218f, 3.125f, 1.571f, 4.518f, 1.659f)
                curveToRelative(-0.381f, 3.287f, -2.659f, 5.563f, -5.954f, 5.937f)
                close()
                moveTo(16.054f, 16.0f)
                curveToRelative(0.076f, 0.0f, -0.076f, 0.008f, 0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _axe!!
    }

private var _axe: ImageVector? = null
