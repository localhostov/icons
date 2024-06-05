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

public val Icons.Filled.PersonCircleCheck: ImageVector
    get() {
        if (_personCircleCheck != null) {
            return _personCircleCheck!!
        }
        _personCircleCheck = Builder(name = "PersonCircleCheck", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
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
                lineToRelative(-1.353f, -1.331f)
                curveToRelative(-0.396f, -0.388f, -1.028f, -0.381f, -1.414f, 0.014f)
                curveToRelative(-0.387f, 0.395f, -0.381f, 1.027f, 0.014f, 1.414f)
                lineToRelative(1.354f, 1.332f)
                curveToRelative(0.46f, 0.449f, 1.062f, 0.674f, 1.663f, 0.674f)
                reflectiveCurveToRelative(1.201f, -0.225f, 1.653f, -0.671f)
                lineToRelative(2.703f, -2.614f)
                curveToRelative(0.398f, -0.383f, 0.411f, -1.016f, 0.029f, -1.414f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.478f, 0.805f, 2.771f, 2.0f, 3.463f)
                verticalLineToRelative(6.537f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.029f, 0.755f, -3.881f, 2.0f, -5.291f)
                verticalLineToRelative(-2.709f)
                close()
            }
        }
        .build()
        return _personCircleCheck!!
    }

private var _personCircleCheck: ImageVector? = null
