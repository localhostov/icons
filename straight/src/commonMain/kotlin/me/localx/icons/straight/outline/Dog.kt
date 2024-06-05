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

public val Icons.Outline.Dog: ImageVector
    get() {
        if (_dog != null) {
            return _dog!!
        }
        _dog = Builder(name = "Dog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.618f, 5.0f)
                curveToRelative(-0.309f, 0.0f, -0.586f, -0.171f, -0.724f, -0.447f)
                curveToRelative(-0.479f, -0.958f, -1.442f, -1.553f, -2.512f, -1.553f)
                horizontalLineToRelative(-1.382f)
                lineTo(17.0f, 0.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(1.668f)
                lineToRelative(-1.202f, 3.331f)
                lineToRelative(-6.797f, 0.004f)
                curveToRelative(-0.827f, 0.0f, -1.616f, 0.249f, -2.281f, 0.713f)
                curveToRelative(-0.482f, -0.332f, -1.72f, -1.411f, -1.72f, -3.716f)
                lineTo(0.0f, 5.0f)
                curveToRelative(0.0f, 2.962f, 1.531f, 4.557f, 2.413f, 5.231f)
                curveToRelative(-0.27f, 0.545f, -0.412f, 1.148f, -0.412f, 1.774f)
                lineToRelative(0.003f, 12.0f)
                horizontalLineToRelative(5.996f)
                verticalLineToRelative(-5.0f)
                lineToRelative(5.0f, -0.003f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(6.003f)
                verticalLineToRelative(-6.395f)
                lineToRelative(1.191f, -5.605f)
                horizontalLineToRelative(0.805f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.382f)
                close()
                moveTo(22.0f, 9.0f)
                curveToRelative(0.0f, 0.551f, -0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.425f)
                lineToRelative(-1.549f, 7.292f)
                lineToRelative(-0.022f, 4.708f)
                horizontalLineToRelative(-2.003f)
                verticalLineToRelative(-5.0f)
                lineToRelative(-9.0f, 0.005f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.997f)
                lineToRelative(-0.002f, -10.0f)
                curveToRelative(0.0f, -0.534f, 0.208f, -1.037f, 0.585f, -1.415f)
                curveToRelative(0.378f, -0.378f, 0.88f, -0.586f, 1.415f, -0.586f)
                lineToRelative(8.201f, -0.005f)
                lineToRelative(1.804f, -4.999f)
                horizontalLineToRelative(2.375f)
                curveToRelative(0.309f, 0.0f, 0.586f, 0.171f, 0.724f, 0.447f)
                curveToRelative(0.479f, 0.958f, 1.442f, 1.553f, 2.512f, 1.553f)
                horizontalLineToRelative(0.382f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _dog!!
    }

private var _dog: ImageVector? = null
