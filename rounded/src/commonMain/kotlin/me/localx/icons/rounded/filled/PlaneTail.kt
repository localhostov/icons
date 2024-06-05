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

public val Icons.Filled.PlaneTail: ImageVector
    get() {
        if (_planeTail != null) {
            return _planeTail!!
        }
        _planeTail = Builder(name = "PlaneTail", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.61f, 16.085f)
                curveToRelative(-4.229f, -1.525f, -12.397f, -4.085f, -19.603f, -4.085f)
                lineTo(1.0f, 12.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                lineTo(3.008f, 24.0f)
                curveToRelative(7.196f, 0.0f, 15.358f, -2.479f, 19.583f, -3.956f)
                curveToRelative(0.853f, -0.298f, 1.405f, -1.072f, 1.409f, -1.973f)
                reflectiveCurveToRelative(-0.541f, -1.681f, -1.39f, -1.986f)
                close()
                moveTo(13.0f, 19.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(8.561f, 10.414f)
                curveToRelative(0.26f, -0.247f, 0.512f, -0.512f, 0.739f, -0.814f)
                lineTo(15.15f, 1.801f)
                curveToRelative(0.845f, -1.128f, 2.19f, -1.801f, 3.6f, -1.801f)
                horizontalLineToRelative(0.298f)
                curveToRelative(0.783f, 0.0f, 1.505f, 0.356f, 1.982f, 0.977f)
                curveToRelative(0.477f, 0.621f, 0.635f, 1.411f, 0.433f, 2.168f)
                lineToRelative(-2.562f, 9.608f)
                curveToRelative(-3.003f, -0.908f, -6.633f, -1.825f, -10.34f, -2.339f)
                close()
            }
        }
        .build()
        return _planeTail!!
    }

private var _planeTail: ImageVector? = null
