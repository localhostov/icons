package me.localx.icons.straight.outline

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

public val Icons.Outline.PersonCircleQuestion: ImageVector
    get() {
        if (_personCircleQuestion != null) {
            return _personCircleQuestion!!
        }
        _personCircleQuestion = Builder(name = "PersonCircleQuestion", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(24.0f, 17.0f)
                curveToRelative(0.0f, 3.859f, -3.14f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.141f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.141f, 7.0f, 7.0f)
                close()
                moveTo(22.0f, 17.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                curveToRelative(0.0f, 2.414f, 1.721f, 4.435f, 4.0f, 4.899f)
                verticalLineToRelative(-1.899f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.899f)
                curveToRelative(2.279f, -0.465f, 4.0f, -2.485f, 4.0f, -4.899f)
                close()
                moveTo(10.0f, 11.349f)
                curveToRelative(-1.249f, 1.545f, -2.0f, 3.51f, -2.0f, 5.651f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                lineTo(0.0f, 17.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.637f, 0.0f, 2.971f, 1.318f, 2.999f, 2.948f)
                curveToRelative(0.0f, 0.017f, 0.001f, 2.401f, 0.001f, 2.401f)
                close()
                moveTo(8.0f, 9.0f)
                curveToRelative(0.0f, -0.552f, -0.449f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 8.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(17.536f, 13.048f)
                curveToRelative(-0.885f, -0.161f, -1.783f, 0.081f, -2.463f, 0.653f)
                curveToRelative(-0.682f, 0.572f, -1.072f, 1.41f, -1.072f, 2.299f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -0.297f, 0.13f, -0.576f, 0.358f, -0.767f)
                curveToRelative(0.23f, -0.193f, 0.526f, -0.271f, 0.832f, -0.216f)
                curveToRelative(0.391f, 0.068f, 0.725f, 0.401f, 0.793f, 0.793f)
                curveToRelative(0.093f, 0.531f, -0.212f, 0.907f, -0.502f, 1.066f)
                curveToRelative(-0.443f, 0.244f, -1.481f, 0.815f, -1.481f, 2.123f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -0.053f, 0.0f, -0.125f, 0.447f, -0.371f)
                curveToRelative(1.124f, -0.621f, 1.729f, -1.892f, 1.506f, -3.164f)
                curveToRelative(-0.213f, -1.212f, -1.208f, -2.206f, -2.417f, -2.417f)
                close()
            }
        }
        .build()
        return _personCircleQuestion!!
    }

private var _personCircleQuestion: ImageVector? = null
