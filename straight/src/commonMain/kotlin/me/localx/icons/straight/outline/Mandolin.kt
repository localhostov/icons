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

public val Icons.Outline.Mandolin: ImageVector
    get() {
        if (_mandolin != null) {
            return _mandolin!!
        }
        _mandolin = Builder(name = "Mandolin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 6.0f)
                lineToRelative(2.001f, -2.819f)
                lineTo(20.819f, -0.001f)
                lineToRelative(-2.819f, 2.001f)
                lineToRelative(-0.323f, 2.909f)
                lineToRelative(-2.091f, 2.091f)
                horizontalLineToRelative(-7.086f)
                curveTo(3.813f, 7.0f, 0.0f, 10.813f, 0.0f, 15.5f)
                curveToRelative(0.0f, 2.271f, 0.884f, 4.405f, 2.49f, 6.011f)
                curveToRelative(1.606f, 1.605f, 3.741f, 2.489f, 6.01f, 2.489f)
                curveToRelative(4.687f, 0.0f, 8.5f, -3.813f, 8.5f, -8.5f)
                verticalLineToRelative(-7.086f)
                lineToRelative(2.091f, -2.091f)
                lineToRelative(2.909f, -0.323f)
                close()
                moveTo(15.0f, 15.5f)
                curveToRelative(0.0f, 3.584f, -2.916f, 6.5f, -6.5f, 6.5f)
                curveToRelative(-1.735f, 0.0f, -3.368f, -0.676f, -4.596f, -1.903f)
                curveToRelative(-1.228f, -1.228f, -1.904f, -2.86f, -1.904f, -4.597f)
                curveToRelative(0.0f, -3.584f, 2.916f, -6.5f, 6.5f, -6.5f)
                horizontalLineToRelative(5.086f)
                lineToRelative(-3.422f, 3.422f)
                curveToRelative(-0.495f, -0.269f, -1.062f, -0.422f, -1.664f, -0.422f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -0.602f, -0.153f, -1.169f, -0.422f, -1.664f)
                lineToRelative(3.422f, -3.422f)
                verticalLineToRelative(5.086f)
                close()
                moveTo(10.0f, 15.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _mandolin!!
    }

private var _mandolin: ImageVector? = null
