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

public val Icons.Outline.CanFood: ImageVector
    get() {
        if (_canFood != null) {
            return _canFood!!
        }
        _canFood = Builder(name = "CanFood", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(8.286f, 0.0f, 2.0f, 0.737f, 2.0f, 3.5f)
                curveToRelative(0.0f, 0.017f, 0.007f, 0.033f, 0.007f, 0.05f)
                horizontalLineToRelative(-0.007f)
                verticalLineToRelative(16.95f)
                curveToRelative(0.0f, 2.763f, 6.286f, 3.5f, 10.0f, 3.5f)
                curveToRelative(3.459f, 0.0f, 10.0f, -0.742f, 10.0f, -3.55f)
                lineTo(22.0f, 3.5f)
                curveToRelative(0.0f, -2.763f, -6.286f, -3.5f, -10.0f, -3.5f)
                close()
                moveTo(20.0f, 7.368f)
                curveToRelative(-0.398f, 0.585f, -3.413f, 1.632f, -8.0f, 1.632f)
                reflectiveCurveToRelative(-7.597f, -1.017f, -8.0f, -1.585f)
                verticalLineToRelative(-1.68f)
                curveToRelative(2.159f, 0.955f, 5.609f, 1.264f, 8.0f, 1.264f)
                reflectiveCurveToRelative(5.841f, -0.31f, 8.0f, -1.265f)
                verticalLineToRelative(1.633f)
                close()
                moveTo(20.0f, 16.368f)
                curveToRelative(-0.398f, 0.585f, -3.413f, 1.632f, -8.0f, 1.632f)
                reflectiveCurveToRelative(-7.597f, -1.017f, -8.0f, -1.585f)
                verticalLineToRelative(-6.68f)
                curveToRelative(2.159f, 0.955f, 5.609f, 1.264f, 8.0f, 1.264f)
                curveToRelative(2.248f, 0.0f, 5.79f, -0.318f, 8.0f, -1.309f)
                verticalLineToRelative(6.677f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(4.746f, 0.0f, 7.396f, 0.986f, 7.937f, 1.5f)
                curveToRelative(-0.542f, 0.514f, -3.191f, 1.5f, -7.937f, 1.5f)
                reflectiveCurveToRelative(-7.396f, -0.986f, -7.937f, -1.5f)
                curveToRelative(0.541f, -0.514f, 3.191f, -1.5f, 7.937f, -1.5f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-4.562f, 0.0f, -7.574f, -1.007f, -8.0f, -1.577f)
                verticalLineToRelative(-1.687f)
                curveToRelative(2.159f, 0.955f, 5.609f, 1.264f, 8.0f, 1.264f)
                curveToRelative(2.248f, 0.0f, 5.79f, -0.318f, 8.0f, -1.309f)
                verticalLineToRelative(1.685f)
                curveToRelative(-0.422f, 0.586f, -3.436f, 1.624f, -8.0f, 1.624f)
                close()
            }
        }
        .build()
        return _canFood!!
    }

private var _canFood: ImageVector? = null
