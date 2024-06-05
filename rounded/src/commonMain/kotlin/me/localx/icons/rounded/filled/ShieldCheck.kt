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

public val Icons.Filled.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) {
            return _shieldCheck!!
        }
        _shieldCheck = Builder(name = "ShieldCheck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.581f, 2.14f)
                lineTo(12.316f, 0.051f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.632f, 0.0f)
                lineTo(5.419f, 2.14f)
                arcTo(4.993f, 4.993f, 0.0f, false, false, 2.0f, 6.883f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, 7.563f, 9.2f, 11.74f, 9.594f, 11.914f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.812f, 0.0f)
                curveTo(12.8f, 23.74f, 22.0f, 19.563f, 22.0f, 12.0f)
                verticalLineTo(6.883f)
                arcTo(4.993f, 4.993f, 0.0f, false, false, 18.581f, 2.14f)
                close()
                moveTo(16.718f, 9.717f)
                lineToRelative(-4.272f, 4.272f)
                arcToRelative(1.873f, 1.873f, 0.0f, false, true, -1.335f, 0.553f)
                horizontalLineToRelative(-0.033f)
                arcToRelative(1.872f, 1.872f, 0.0f, false, true, -1.345f, -0.6f)
                lineToRelative(-2.306f, -2.4f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 8.868f, 10.16f)
                lineTo(11.112f, 12.5f)
                lineTo(15.3f, 8.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
