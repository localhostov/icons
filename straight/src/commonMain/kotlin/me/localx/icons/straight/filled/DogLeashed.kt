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

public val Icons.Filled.DogLeashed: ImageVector
    get() {
        if (_dogLeashed != null) {
            return _dogLeashed!!
        }
        _dogLeashed = Builder(name = "DogLeashed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 10.094f)
                lineToRelative(6.561f, 2.808f)
                lineToRelative(-1.561f, 4.698f)
                verticalLineToRelative(6.395f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-13.901f)
                close()
                moveTo(21.618f, 4.995f)
                curveToRelative(-0.309f, 0.0f, -0.586f, -0.171f, -0.724f, -0.447f)
                curveToRelative(-0.479f, -0.958f, -1.442f, -1.553f, -2.512f, -1.553f)
                horizontalLineToRelative(-1.382f)
                lineTo(17.0f, -0.004f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(1.668f)
                lineToRelative(-0.907f, 2.512f)
                lineTo(3.236f, 0.0f)
                lineTo(0.0f, 0.0f)
                lineToRelative(10.995f, 7.996f)
                lineToRelative(-4.994f, 0.003f)
                curveToRelative(-0.827f, 0.0f, -1.616f, 0.249f, -2.281f, 0.713f)
                curveToRelative(-0.482f, -0.332f, -1.72f, -1.411f, -1.72f, -3.716f)
                lineTo(0.0f, 4.996f)
                curveToRelative(0.0f, 2.962f, 1.531f, 4.557f, 2.413f, 5.231f)
                curveToRelative(-0.27f, 0.545f, -0.412f, 1.148f, -0.412f, 1.774f)
                lineToRelative(0.003f, 12.0f)
                horizontalLineToRelative(4.996f)
                verticalLineToRelative(-6.001f)
                lineToRelative(4.0f, -0.002f)
                verticalLineToRelative(-9.997f)
                horizontalLineToRelative(2.25f)
                lineToRelative(6.945f, 2.996f)
                horizontalLineToRelative(0.805f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.382f)
                close()
            }
        }
        .build()
        return _dogLeashed!!
    }

private var _dogLeashed: ImageVector? = null
