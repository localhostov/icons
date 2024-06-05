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

public val Icons.Filled.HouseChimneyCrack: ImageVector
    get() {
        if (_houseChimneyCrack != null) {
            return _houseChimneyCrack!!
        }
        _houseChimneyCrack = Builder(name = "HouseChimneyCrack", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 5.734f)
                verticalLineTo(2.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(2.366f)
                lineTo(14.797f, 0.855f)
                curveToRelative(-1.69f, -1.14f, -3.903f, -1.14f, -5.594f, 0.0f)
                lineTo(2.204f, 5.577f)
                curveToRelative(-1.378f, 0.93f, -2.204f, 2.484f, -2.204f, 4.146f)
                verticalLineToRelative(9.276f)
                curveToRelative(0.0f, 2.761f, 2.239f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(3.174f)
                curveToRelative(0.62f, 0.0f, 1.175f, -0.381f, 1.399f, -0.959f)
                lineToRelative(1.564f, -4.041f)
                horizontalLineToRelative(-2.755f)
                curveToRelative(-1.086f, 0.0f, -1.739f, -1.204f, -1.147f, -2.114f)
                lineToRelative(4.952f, -7.361f)
                curveToRelative(0.215f, -0.328f, 0.581f, -0.525f, 0.973f, -0.525f)
                curveToRelative(0.782f, 0.0f, 1.341f, 0.755f, 1.114f, 1.503f)
                lineToRelative(-1.369f, 4.497f)
                horizontalLineToRelative(2.87f)
                curveToRelative(0.843f, 0.0f, 1.435f, 0.831f, 1.16f, 1.628f)
                lineToRelative(-2.032f, 6.054f)
                curveToRelative(-0.217f, 0.648f, 0.265f, 1.318f, 0.948f, 1.318f)
                horizontalLineToRelative(3.15f)
                curveToRelative(2.761f, 0.0f, 5.0f, -2.239f, 5.0f, -5.0f)
                verticalLineTo(9.723f)
                curveToRelative(0.0f, -1.576f, -0.749f, -3.047f, -2.0f, -3.989f)
                close()
            }
        }
        .build()
        return _houseChimneyCrack!!
    }

private var _houseChimneyCrack: ImageVector? = null
