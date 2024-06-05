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

public val Icons.Filled.PersonCircleQuestion: ImageVector
    get() {
        if (_personCircleQuestion != null) {
            return _personCircleQuestion!!
        }
        _personCircleQuestion = Builder(name = "PersonCircleQuestion", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 12.709f)
                curveToRelative(-1.037f, 1.175f, -1.796f, 2.656f, -2.0f, 4.291f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.637f, 0.0f, 2.971f, 1.318f, 2.999f, 2.948f)
                curveToRelative(0.0f, 0.017f, 0.001f, 0.034f, 0.001f, 0.052f)
                verticalLineToRelative(3.709f)
                close()
                moveTo(7.0f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(19.0f, 23.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(19.447f, 19.58f)
                curveToRelative(-0.459f, 0.252f, -0.459f, 0.365f, -0.459f, 0.42f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.35f, 1.124f, -1.969f, 1.493f, -2.172f)
                curveToRelative(0.289f, -0.16f, 0.595f, -0.535f, 0.502f, -1.065f)
                curveToRelative(-0.069f, -0.393f, -0.402f, -0.726f, -0.793f, -0.794f)
                curveToRelative(-0.311f, -0.057f, -0.603f, 0.021f, -0.832f, 0.216f)
                curveToRelative(-0.228f, 0.19f, -0.358f, 0.47f, -0.358f, 0.767f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.889f, 0.391f, -1.727f, 1.072f, -2.299f)
                curveToRelative(0.681f, -0.572f, 1.579f, -0.814f, 2.464f, -0.653f)
                curveToRelative(1.21f, 0.211f, 2.205f, 1.206f, 2.417f, 2.418f)
                curveToRelative(0.224f, 1.271f, -0.381f, 2.542f, -1.506f, 3.163f)
                close()
            }
        }
        .build()
        return _personCircleQuestion!!
    }

private var _personCircleQuestion: ImageVector? = null
