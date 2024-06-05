package me.localx.icons.rounded.filled

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

public val Icons.Filled.Burrito: ImageVector
    get() {
        if (_burrito != null) {
            return _burrito!!
        }
        _burrito = Builder(name = "Burrito", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                verticalLineToRelative(6.5f)
                arcToRelative(19.475f, 19.475f, 0.0f, false, false, -5.265f, -4.681f)
                arcTo(9.771f, 9.771f, 0.0f, false, true, 20.0f, 8.0f)
                close()
                moveTo(19.929f, 18.872f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 14.0f, 24.0f)
                lineTo(10.0f, 24.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, true, -6.0f, -6.0f)
                lineTo(4.0f, 8.0f)
                curveTo(8.079f, 8.0f, 18.427f, 12.574f, 19.929f, 18.872f)
                close()
                moveTo(9.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 20.0f)
                close()
                moveTo(11.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 17.0f)
                close()
                moveTo(13.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 20.0f)
                close()
                moveTo(18.0f, 1.0f)
                arcToRelative(2.982f, 2.982f, 0.0f, false, false, -1.137f, 0.224f)
                arcTo(4.07f, 4.07f, 0.0f, false, false, 12.0f, 0.545f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, false, -4.863f, 0.679f)
                curveTo(4.234f, 0.047f, 1.811f, 3.515f, 3.623f, 6.0f)
                arcTo(13.085f, 13.085f, 0.0f, false, true, 8.5f, 7.048f)
                curveToRelative(0.821f, -0.869f, 2.233f, -3.63f, 3.543f, -2.107f)
                curveToRelative(0.666f, 1.224f, -1.145f, 1.91f, -1.649f, 2.912f)
                curveToRelative(0.7f, 0.33f, 1.413f, 0.7f, 2.127f, 1.114f)
                arcTo(12.376f, 12.376f, 0.0f, false, true, 20.384f, 6.0f)
                arcTo(3.12f, 3.12f, 0.0f, false, false, 18.0f, 1.0f)
                close()
            }
        }
        .build()
        return _burrito!!
    }

private var _burrito: ImageVector? = null
