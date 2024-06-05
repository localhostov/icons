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

public val Icons.Outline.Smile: ImageVector
    get() {
        if (_smile != null) {
            return _smile!!
        }
        _smile = Builder(name = "Smile", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 22.0f, 12.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(17.666f, 15.746f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.33f, -1.494f)
                arcTo(7.508f, 7.508f, 0.0f, false, true, 12.0f, 16.0f)
                arcToRelative(7.509f, 7.509f, 0.0f, false, true, -4.334f, -1.746f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.332f, 1.492f)
                arcTo(9.454f, 9.454f, 0.0f, false, false, 12.0f, 18.0f)
                arcTo(9.454f, 9.454f, 0.0f, false, false, 17.666f, 15.746f)
                close()
                moveTo(6.0f, 10.0f)
                curveToRelative(0.0f, 1.0f, 0.895f, 1.0f, 2.0f, 1.0f)
                reflectiveCurveToRelative(2.0f, 0.0f, 2.0f, -1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                close()
                moveTo(14.0f, 10.0f)
                curveToRelative(0.0f, 1.0f, 0.895f, 1.0f, 2.0f, 1.0f)
                reflectiveCurveToRelative(2.0f, 0.0f, 2.0f, -1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                close()
            }
        }
        .build()
        return _smile!!
    }

private var _smile: ImageVector? = null
