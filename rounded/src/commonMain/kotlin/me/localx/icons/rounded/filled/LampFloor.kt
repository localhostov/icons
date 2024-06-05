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

public val Icons.Filled.LampFloor: ImageVector
    get() {
        if (_lampFloor != null) {
            return _lampFloor!!
        }
        _lampFloor = Builder(name = "LampFloor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.749f, 11.0f)
                curveToRelative(0.957f, 0.0f, 1.861f, -0.419f, 2.48f, -1.149f)
                curveToRelative(0.618f, -0.73f, 0.883f, -1.691f, 0.726f, -2.635f)
                lineToRelative(-0.75f, -4.5f)
                curveToRelative(-0.262f, -1.573f, -1.61f, -2.715f, -3.206f, -2.715f)
                horizontalLineToRelative(-7.999f)
                curveToRelative(-1.595f, 0.0f, -2.943f, 1.142f, -3.206f, 2.715f)
                lineToRelative(-0.75f, 4.5f)
                curveToRelative(-0.157f, 0.944f, 0.107f, 1.905f, 0.726f, 2.635f)
                curveToRelative(0.619f, 0.73f, 1.522f, 1.149f, 2.479f, 1.149f)
                horizontalLineToRelative(3.75f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(3.749f)
                close()
            }
        }
        .build()
        return _lampFloor!!
    }

private var _lampFloor: ImageVector? = null
