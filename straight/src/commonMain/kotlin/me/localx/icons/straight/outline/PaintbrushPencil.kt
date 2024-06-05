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

public val Icons.Outline.PaintbrushPencil: ImageVector
    get() {
        if (_paintbrushPencil != null) {
            return _paintbrushPencil!!
        }
        _paintbrushPencil = Builder(name = "PaintbrushPencil", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.075f, 6.264f)
                curveTo(-0.355f, 4.833f, -0.355f, 2.505f, 1.075f, 1.074f)
                reflectiveCurveToRelative(3.757f, -1.43f, 5.188f, 0.0f)
                lineToRelative(4.331f, 4.331f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(4.85f, 2.488f)
                curveToRelative(-0.649f, -0.65f, -1.709f, -0.65f, -2.36f, 0.0f)
                curveToRelative(-0.651f, 0.651f, -0.651f, 1.71f, 0.0f, 2.361f)
                lineToRelative(4.33f, 4.331f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(1.075f, 6.264f)
                close()
                moveTo(11.97f, 17.23f)
                curveToRelative(0.081f, 1.507f, -0.453f, 3.042f, -1.602f, 4.19f)
                curveToRelative(-1.929f, 1.928f, -8.023f, 2.422f, -9.226f, 2.501f)
                lineToRelative(-1.139f, 0.075f)
                lineToRelative(0.075f, -1.139f)
                curveToRelative(0.079f, -1.202f, 0.573f, -7.297f, 2.501f, -9.226f)
                curveToRelative(1.154f, -1.154f, 2.697f, -1.687f, 4.211f, -1.6f)
                lineTo(17.736f, 1.086f)
                curveToRelative(1.43f, -1.432f, 3.76f, -1.432f, 5.189f, 0.0f)
                curveToRelative(1.431f, 1.431f, 1.431f, 3.758f, 0.0f, 5.188f)
                lineToRelative(-10.956f, 10.955f)
                close()
                moveTo(9.012f, 12.639f)
                curveToRelative(0.489f, 0.253f, 0.947f, 0.584f, 1.356f, 0.993f)
                curveToRelative(0.413f, 0.413f, 0.746f, 0.877f, 1.001f, 1.371f)
                lineToRelative(10.143f, -10.142f)
                curveToRelative(0.315f, -0.315f, 0.488f, -0.734f, 0.488f, -1.18f)
                reflectiveCurveToRelative(-0.173f, -0.865f, -0.488f, -1.181f)
                curveToRelative(-0.65f, -0.65f, -1.711f, -0.65f, -2.361f, 0.0f)
                lineToRelative(-10.138f, 10.138f)
                close()
                moveTo(8.954f, 15.046f)
                curveToRelative(-0.684f, -0.684f, -1.582f, -1.024f, -2.479f, -1.024f)
                reflectiveCurveToRelative(-1.797f, 0.341f, -2.48f, 1.024f)
                curveToRelative(-0.932f, 0.933f, -1.555f, 4.272f, -1.818f, 6.778f)
                curveToRelative(2.506f, -0.264f, 5.846f, -0.887f, 6.778f, -1.818f)
                curveToRelative(1.366f, -1.367f, 1.366f, -3.593f, 0.0f, -4.96f)
                close()
                moveTo(18.595f, 13.405f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(4.819f, 4.82f)
                verticalLineToRelative(2.36f)
                horizontalLineToRelative(-2.36f)
                lineToRelative(-4.82f, -4.819f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(5.406f, 5.405f)
                horizontalLineToRelative(5.188f)
                verticalLineToRelative(-5.188f)
                lineToRelative(-5.405f, -5.406f)
                close()
            }
        }
        .build()
        return _paintbrushPencil!!
    }

private var _paintbrushPencil: ImageVector? = null
