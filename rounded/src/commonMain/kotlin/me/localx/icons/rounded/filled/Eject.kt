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

public val Icons.Filled.Eject: ImageVector
    get() {
        if (_eject != null) {
            return _eject!!
        }
        _eject = Builder(name = "Eject", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 22.0f)
                lineTo(1.0f, 22.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(22.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(23.56f, 15.809f)
                curveToRelative(0.695f, -1.374f, 0.567f, -2.933f, -0.401f, -4.245f)
                lineTo(15.195f, 2.595f)
                curveToRelative(-0.761f, -1.014f, -1.923f, -1.595f, -3.195f, -1.595f)
                curveToRelative(-1.289f, 0.0f, -2.464f, 0.596f, -3.166f, 1.562f)
                lineTo(0.775f, 11.636f)
                curveTo(0.263f, 12.334f, -0.008f, 13.148f, -0.008f, 13.991f)
                curveToRelative(0.0f, 0.629f, 0.148f, 1.241f, 0.44f, 1.818f)
                curveToRelative(0.695f, 1.372f, 2.029f, 2.191f, 3.567f, 2.191f)
                horizontalLineToRelative(15.993f)
                curveToRelative(1.538f, 0.0f, 2.872f, -0.819f, 3.567f, -2.191f)
                close()
            }
        }
        .build()
        return _eject!!
    }

private var _eject: ImageVector? = null
