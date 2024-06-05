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

public val Icons.Filled.UserTrust: ImageVector
    get() {
        if (_userTrust != null) {
            return _userTrust!!
        }
        _userTrust = Builder(name = "UserTrust", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                curveTo(3.0f, 2.691f, 5.692f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveTo(3.0f, 9.309f, 3.0f, 6.0f)
                close()
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.686f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.686f, 6.0f, 6.0f)
                close()
                moveTo(21.712f, 16.298f)
                curveToRelative(-0.383f, -0.399f, -1.017f, -0.41f, -1.414f, -0.029f)
                lineToRelative(-2.713f, 2.624f)
                curveToRelative(-0.143f, 0.141f, -0.379f, 0.144f, -0.522f, 0.002f)
                lineToRelative(-1.354f, -1.331f)
                curveToRelative(-0.396f, -0.388f, -1.028f, -0.381f, -1.414f, 0.014f)
                curveToRelative(-0.387f, 0.395f, -0.381f, 1.027f, 0.014f, 1.414f)
                lineToRelative(1.354f, 1.332f)
                curveToRelative(0.46f, 0.449f, 1.062f, 0.674f, 1.663f, 0.674f)
                reflectiveCurveToRelative(1.201f, -0.225f, 1.653f, -0.671f)
                lineToRelative(2.703f, -2.614f)
                curveToRelative(0.398f, -0.383f, 0.411f, -1.016f, 0.029f, -1.414f)
                close()
                moveTo(10.0f, 18.0f)
                curveToRelative(0.0f, -1.368f, 0.345f, -2.655f, 0.95f, -3.781f)
                curveToRelative(-0.629f, -0.14f, -1.28f, -0.219f, -1.95f, -0.219f)
                horizontalLineToRelative(0.0f)
                curveTo(4.044f, 14.0f, 0.01f, 18.028f, 0.0f, 22.983f)
                curveToRelative(-0.001f, 0.557f, 0.443f, 1.017f, 1.0f, 1.017f)
                lineTo(12.721f, 24.0f)
                curveToRelative(-1.665f, -1.466f, -2.721f, -3.607f, -2.721f, -6.0f)
                close()
            }
        }
        .build()
        return _userTrust!!
    }

private var _userTrust: ImageVector? = null
