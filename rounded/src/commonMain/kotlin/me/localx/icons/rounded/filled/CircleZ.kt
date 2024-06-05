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

public val Icons.Filled.CircleZ: ImageVector
    get() {
        if (_circleZ != null) {
            return _circleZ!!
        }
        _circleZ = Builder(name = "CircleZ", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(9.021f, 15.787f)
                curveToRelative(0.048f, 0.142f, 0.141f, 0.213f, 0.277f, 0.213f)
                horizontalLineToRelative(6.702f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-6.702f)
                curveToRelative(-1.0f, 0.0f, -1.854f, -0.62f, -2.174f, -1.58f)
                curveToRelative(-0.326f, -0.976f, -0.009f, -2.002f, 0.807f, -2.615f)
                lineToRelative(6.938f, -5.209f)
                curveToRelative(0.166f, -0.124f, 0.141f, -0.293f, 0.111f, -0.383f)
                curveToRelative(-0.048f, -0.142f, -0.141f, -0.213f, -0.277f, -0.213f)
                horizontalLineToRelative(-6.702f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.702f)
                curveToRelative(1.0f, 0.0f, 1.854f, 0.62f, 2.174f, 1.58f)
                curveToRelative(0.326f, 0.976f, 0.009f, 2.002f, -0.807f, 2.615f)
                lineToRelative(-6.938f, 5.209f)
                curveToRelative(-0.166f, 0.124f, -0.141f, 0.293f, -0.111f, 0.383f)
                close()
            }
        }
        .build()
        return _circleZ!!
    }

private var _circleZ: ImageVector? = null
