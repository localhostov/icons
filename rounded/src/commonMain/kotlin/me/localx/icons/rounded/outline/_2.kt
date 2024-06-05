package me.localx.icons.rounded.outline

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

public val Icons.Outline._2: ImageVector
    get() {
        if (__2 != null) {
            return __2!!
        }
        __2 = Builder(name = "_2", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 24.0f)
                horizontalLineTo(6.501f)
                curveToRelative(-0.919f, 0.0f, -1.762f, -0.502f, -2.198f, -1.311f)
                curveToRelative(-0.44f, -0.814f, -0.396f, -1.803f, 0.113f, -2.579f)
                curveToRelative(1.232f, -1.877f, 3.602f, -3.06f, 6.11f, -4.312f)
                curveToRelative(4.085f, -2.04f, 7.944f, -3.965f, 7.422f, -8.681f)
                curveToRelative(-0.317f, -2.87f, -2.931f, -5.118f, -5.95f, -5.118f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveTo(4.0f, 3.589f, 7.589f, 0.0f, 12.0f, 0.0f)
                curveToRelative(4.09f, 0.0f, 7.502f, 2.966f, 7.938f, 6.898f)
                curveToRelative(0.675f, 6.102f, -4.422f, 8.646f, -8.517f, 10.69f)
                curveToRelative(-2.261f, 1.128f, -4.396f, 2.194f, -5.332f, 3.62f)
                curveToRelative(-0.155f, 0.235f, -0.069f, 0.45f, -0.025f, 0.531f)
                curveToRelative(0.053f, 0.097f, 0.179f, 0.26f, 0.438f, 0.26f)
                horizontalLineToRelative(13.499f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return __2!!
    }

private var __2: ImageVector? = null
