package me.localx.icons.straight.bold

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

public val Icons.Bold.KnifeKitchen: ImageVector
    get() {
        if (_knifeKitchen != null) {
            return _knifeKitchen!!
        }
        _knifeKitchen = Builder(name = "KnifeKitchen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.83f, 7.856f)
                curveToRelative(1.56f, -1.559f, 1.56f, -4.097f, 0.0f, -5.657f)
                curveToRelative(-1.561f, -1.559f, -4.098f, -1.559f, -5.656f, 0.0f)
                lineTo(1.539f, 17.819f)
                curveTo(0.547f, 18.81f, 0.0f, 20.127f, 0.0f, 21.528f)
                verticalLineToRelative(1.472f)
                reflectiveCurveToRelative(2.078f, 0.04f, 2.69f, 0.04f)
                curveToRelative(0.316f, 0.0f, 0.634f, -0.003f, 0.87f, -0.012f)
                curveToRelative(4.0f, -0.159f, 7.436f, -1.565f, 9.942f, -4.072f)
                lineToRelative(2.243f, -2.263f)
                reflectiveCurveToRelative(1.221f, 1.229f, 1.341f, 1.339f)
                lineToRelative(2.079f, -2.162f)
                lineToRelative(-0.3f, -0.3f)
                curveToRelative(-0.432f, -0.492f, -0.675f, -1.113f, -0.69f, -1.777f)
                curveToRelative(-0.018f, -0.766f, 0.268f, -1.489f, 0.806f, -2.034f)
                lineToRelative(3.849f, -3.902f)
                close()
                moveTo(11.377f, 16.839f)
                curveToRelative(-2.424f, 2.424f, -5.55f, 3.074f, -7.795f, 3.184f)
                curveToRelative(0.025f, -0.028f, 0.051f, -0.055f, 0.078f, -0.082f)
                lineToRelative(7.671f, -7.664f)
                lineToRelative(2.294f, 2.294f)
                lineToRelative(-2.248f, 2.268f)
                close()
                moveTo(16.845f, 9.651f)
                curveToRelative(-0.69f, 0.699f, -1.18f, 1.539f, -1.444f, 2.454f)
                lineToRelative(-1.948f, -1.949f)
                lineToRelative(5.841f, -5.836f)
                curveToRelative(0.39f, -0.389f, 1.024f, -0.39f, 1.414f, 0.0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, -0.007f, 1.422f)
                lineToRelative(-3.856f, 3.909f)
                close()
            }
        }
        .build()
        return _knifeKitchen!!
    }

private var _knifeKitchen: ImageVector? = null
