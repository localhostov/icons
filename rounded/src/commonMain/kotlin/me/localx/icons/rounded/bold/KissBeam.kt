package me.localx.icons.rounded.bold

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

public val Icons.Bold.KissBeam: ImageVector
    get() {
        if (_kissBeam != null) {
            return _kissBeam!!
        }
        _kissBeam = Builder(name = "KissBeam", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 0.0f, 12.0f)
                curveTo(0.6f, -3.9f, 23.4f, -3.893f, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, false, -9.0f, 9.0f)
                curveToRelative(0.452f, 11.923f, 17.549f, 11.92f, 18.0f, 0.0f)
                arcTo(9.01f, 9.01f, 0.0f, false, false, 12.0f, 3.0f)
                close()
                moveTo(9.808f, 10.968f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.16f, -1.776f)
                curveToRelative(-0.888f, -4.217f, -5.05f, -4.211f, -5.936f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.936f, 0.615f)
                curveToRelative(0.01f, -0.046f, 0.02f, -0.091f, 0.032f, -0.134f)
                curveToRelative(0.012f, 0.043f, 0.022f, 0.088f, 0.032f, 0.134f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 11.0f)
                arcTo(1.561f, 1.561f, 0.0f, false, false, 9.808f, 10.968f)
                close()
                moveTo(17.808f, 10.968f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.16f, -1.776f)
                curveToRelative(-0.888f, -4.217f, -5.05f, -4.211f, -5.936f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.936f, 0.615f)
                curveToRelative(0.01f, -0.046f, 0.02f, -0.091f, 0.032f, -0.134f)
                curveToRelative(0.012f, 0.043f, 0.022f, 0.088f, 0.032f, 0.134f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.5f, 11.0f)
                arcTo(1.561f, 1.561f, 0.0f, false, false, 17.808f, 10.968f)
                close()
                moveTo(15.0f, 14.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.5f, 12.0f)
                lineTo(10.769f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(12.5f, 14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(12.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(10.769f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(12.5f, 20.0f)
                arcToRelative(2.507f, 2.507f, 0.0f, false, false, 1.987f, -4.0f)
                arcTo(2.471f, 2.471f, 0.0f, false, false, 15.0f, 14.5f)
                close()
            }
        }
        .build()
        return _kissBeam!!
    }

private var _kissBeam: ImageVector? = null
