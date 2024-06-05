package me.localx.icons.rounded.filled

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

public val Icons.Filled.Dna: ImageVector
    get() {
        if (_dna != null) {
            return _dna!!
        }
        _dna = Builder(name = "Dna", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.569f, 13.572f)
                curveToRelative(-0.455f, -0.316f, -1.078f, -0.202f, -1.392f, 0.252f)
                curveToRelative(-0.314f, 0.454f, -0.201f, 1.077f, 0.253f, 1.391f)
                curveToRelative(0.374f, 0.259f, 0.723f, 0.52f, 1.048f, 0.784f)
                lineTo(7.523f, 15.999f)
                curveToRelative(1.437f, -1.168f, 3.179f, -2.136f, 4.962f, -3.126f)
                curveToRelative(4.46f, -2.478f, 9.515f, -5.286f, 9.515f, -11.874f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.346f, -0.017f, 0.679f, -0.05f, 1.0f)
                lineTo(4.047f, 1.999f)
                curveToRelative(-0.031f, -0.324f, -0.047f, -0.657f, -0.047f, -1.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                curveToRelative(0.0f, 5.021f, 2.902f, 7.676f, 5.431f, 9.428f)
                curveToRelative(0.174f, 0.121f, 0.372f, 0.178f, 0.568f, 0.178f)
                curveToRelative(0.317f, 0.0f, 0.629f, -0.15f, 0.823f, -0.431f)
                curveToRelative(0.314f, -0.454f, 0.201f, -1.077f, -0.253f, -1.391f)
                curveToRelative(-0.374f, -0.259f, -0.723f, -0.52f, -1.048f, -0.784f)
                horizontalLineToRelative(8.956f)
                curveToRelative(-1.437f, 1.168f, -3.179f, 2.136f, -4.962f, 3.126f)
                curveToRelative(-4.46f, 2.478f, -9.515f, 5.286f, -9.515f, 11.874f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.346f, 0.017f, -0.679f, 0.05f, -1.0f)
                horizontalLineToRelative(15.903f)
                curveToRelative(0.031f, 0.324f, 0.047f, 0.657f, 0.047f, 1.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, -5.021f, -2.902f, -7.676f, -5.431f, -9.428f)
                close()
                moveTo(5.565f, 6.0f)
                curveToRelative(-0.468f, -0.633f, -0.825f, -1.295f, -1.079f, -2.0f)
                horizontalLineToRelative(15.013f)
                curveToRelative(-0.267f, 0.734f, -0.632f, 1.395f, -1.076f, 2.0f)
                lineTo(5.565f, 6.0f)
                close()
                moveTo(4.501f, 20.0f)
                curveToRelative(0.267f, -0.734f, 0.632f, -1.395f, 1.076f, -2.0f)
                horizontalLineToRelative(12.858f)
                curveToRelative(0.468f, 0.633f, 0.825f, 1.295f, 1.079f, 2.0f)
                lineTo(4.5f, 20.0f)
                close()
            }
        }
        .build()
        return _dna!!
    }

private var _dna: ImageVector? = null
