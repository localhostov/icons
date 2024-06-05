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

public val Icons.Filled.PersonLuggage: ImageVector
    get() {
        if (_personLuggage != null) {
            return _personLuggage!!
        }
        _personLuggage = Builder(name = "PersonLuggage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
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
                curveToRelative(0.0f, 0.0f, 1.551f, -0.076f, 2.12f, 0.577f)
                reflectiveCurveToRelative(0.587f, 1.418f, 0.469f, 2.277f)
                lineToRelative(-0.161f, 1.125f)
                lineToRelative(5.093f, 2.909f)
                lineToRelative(-0.992f, 1.736f)
                lineToRelative(-4.406f, -2.517f)
                lineToRelative(-0.498f, 3.472f)
                lineToRelative(3.019f, 2.015f)
                close()
                moveTo(12.629f, 24.0f)
                horizontalLineToRelative(2.034f)
                lineToRelative(0.901f, -5.365f)
                lineToRelative(-1.799f, -1.2f)
                lineToRelative(-1.136f, 6.565f)
                close()
                moveTo(3.0f, 22.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                close()
                moveTo(5.0f, 18.0f)
                curveToRelative(1.078f, 0.0f, 2.054f, 0.433f, 2.774f, 1.129f)
                lineToRelative(2.75f, -3.565f)
                lineToRelative(-3.115f, -2.415f)
                curveToRelative(-0.595f, -0.46f, -1.336f, -0.66f, -2.08f, -0.561f)
                curveToRelative(-0.746f, 0.099f, -1.408f, 0.483f, -1.853f, 1.071f)
                lineToRelative(-2.913f, 3.724f)
                curveToRelative(-0.918f, 1.212f, -0.688f, 2.956f, 0.51f, 3.893f)
                curveToRelative(0.342f, -1.861f, 1.969f, -3.277f, 3.927f, -3.277f)
                close()
            }
        }
        .build()
        return _personLuggage!!
    }

private var _personLuggage: ImageVector? = null
