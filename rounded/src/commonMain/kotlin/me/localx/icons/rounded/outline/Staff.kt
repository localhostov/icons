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

public val Icons.Outline.Staff: ImageVector
    get() {
        if (_staff != null) {
            return _staff!!
        }
        _staff = Builder(name = "Staff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 4.5f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.121f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1.436f)
                curveToRelative(-1.248f, 0.0f, -2.313f, 0.933f, -2.479f, 2.17f)
                lineToRelative(-0.547f, 4.103f)
                curveToRelative(-0.208f, 1.564f, -0.938f, 3.041f, -2.055f, 4.157f)
                lineTo(1.707f, 23.707f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(11.277f, -11.278f)
                curveToRelative(0.808f, -0.808f, 1.336f, -1.875f, 1.486f, -3.007f)
                lineToRelative(0.547f, -4.103f)
                curveToRelative(0.298f, -2.227f, 2.216f, -3.905f, 4.461f, -3.905f)
                horizontalLineToRelative(1.436f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                close()
            }
        }
        .build()
        return _staff!!
    }

private var _staff: ImageVector? = null
