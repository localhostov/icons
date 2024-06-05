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

public val Icons.Outline.PersonLuggage: ImageVector
    get() {
        if (_personLuggage != null) {
            return _personLuggage!!
        }
        _personLuggage = Builder(name = "PersonLuggage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(21.079f, 17.595f)
                lineToRelative(2.831f, 5.348f)
                lineToRelative(-1.768f, 0.936f)
                lineToRelative(-2.594f, -4.9f)
                lineToRelative(-6.161f, -4.113f)
                lineToRelative(0.782f, -5.236f)
                lineToRelative(-3.262f, 4.062f)
                lineToRelative(-1.56f, -1.252f)
                lineToRelative(3.973f, -4.948f)
                curveToRelative(0.764f, -0.947f, 1.899f, -1.49f, 3.115f, -1.49f)
                horizontalLineToRelative(0.633f)
                curveToRelative(0.867f, 0.0f, 1.69f, 0.374f, 2.26f, 1.027f)
                reflectiveCurveToRelative(0.829f, 1.52f, 0.712f, 2.379f)
                lineToRelative(-0.165f, 1.151f)
                lineToRelative(4.081f, 2.331f)
                lineToRelative(-0.992f, 1.736f)
                lineToRelative(-3.394f, -1.939f)
                lineToRelative(-0.51f, 3.56f)
                lineToRelative(2.02f, 1.348f)
                close()
                moveTo(15.552f, 13.906f)
                lineToRelative(1.664f, 1.111f)
                lineToRelative(0.844f, -5.887f)
                curveToRelative(0.039f, -0.284f, -0.046f, -0.565f, -0.238f, -0.786f)
                curveToRelative(-0.193f, -0.221f, -0.46f, -0.343f, -0.753f, -0.343f)
                horizontalLineToRelative(-0.633f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                lineToRelative(-0.882f, 5.905f)
                close()
                moveTo(12.629f, 24.001f)
                horizontalLineToRelative(2.034f)
                lineToRelative(0.901f, -5.365f)
                lineToRelative(-1.799f, -1.2f)
                lineToRelative(-1.136f, 6.565f)
                close()
                moveTo(5.329f, 12.589f)
                curveToRelative(-0.746f, 0.099f, -1.408f, 0.483f, -1.853f, 1.071f)
                lineToRelative(-2.913f, 3.724f)
                curveToRelative(-0.919f, 1.215f, -0.688f, 2.964f, 0.517f, 3.899f)
                lineToRelative(2.184f, 1.692f)
                curveToRelative(0.343f, 0.609f, 0.988f, 1.025f, 1.736f, 1.025f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                curveToRelative(-0.583f, 0.0f, -1.103f, 0.254f, -1.469f, 0.652f)
                lineToRelative(-1.226f, -0.95f)
                curveToRelative(-0.343f, -0.267f, -0.41f, -0.765f, -0.157f, -1.099f)
                lineToRelative(2.913f, -3.724f)
                curveToRelative(0.129f, -0.171f, 0.318f, -0.28f, 0.531f, -0.309f)
                curveToRelative(0.212f, -0.03f, 0.423f, 0.028f, 0.592f, 0.159f)
                lineToRelative(1.521f, 1.18f)
                lineToRelative(-1.702f, 2.233f)
                curveToRelative(0.675f, 0.176f, 1.283f, 0.515f, 1.77f, 0.986f)
                lineToRelative(2.75f, -3.565f)
                lineToRelative(-3.115f, -2.415f)
                curveToRelative(-0.595f, -0.46f, -1.336f, -0.66f, -2.08f, -0.561f)
                close()
            }
        }
        .build()
        return _personLuggage!!
    }

private var _personLuggage: ImageVector? = null
