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

public val Icons.Bold.Walking: ImageVector
    get() {
        if (_walking != null) {
            return _walking!!
        }
        _walking = Builder(name = "Walking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(15.454f, 13.154f)
                lineToRelative(4.375f, 2.188f)
                lineToRelative(1.342f, -2.684f)
                lineToRelative(-3.625f, -1.812f)
                lineToRelative(-2.319f, -3.651f)
                curveToRelative(-0.665f, -0.76f, -1.625f, -1.195f, -2.634f, -1.195f)
                horizontalLineToRelative(-1.946f)
                lineToRelative(-5.276f, 2.638f)
                lineToRelative(-1.319f, 4.978f)
                lineToRelative(2.899f, 0.769f)
                lineToRelative(0.973f, -3.668f)
                lineToRelative(1.831f, -0.916f)
                lineToRelative(-0.662f, 2.83f)
                curveToRelative(-0.351f, 1.5f, 0.339f, 3.079f, 1.679f, 3.84f)
                lineToRelative(4.229f, 2.403f)
                verticalLineToRelative(5.127f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.873f)
                lineToRelative(-4.494f, -2.553f)
                lineToRelative(0.849f, -3.165f)
                lineToRelative(1.099f, 1.745f)
                close()
                moveTo(8.496f, 17.18f)
                lineToRelative(-0.424f, 1.836f)
                lineToRelative(-2.266f, 4.984f)
                horizontalLineToRelative(3.296f)
                lineToRelative(1.763f, -3.879f)
                lineToRelative(0.269f, -1.144f)
                lineToRelative(-1.352f, -0.768f)
                curveToRelative(-0.489f, -0.278f, -0.916f, -0.63f, -1.287f, -1.029f)
                close()
            }
        }
        .build()
        return _walking!!
    }

private var _walking: ImageVector? = null
