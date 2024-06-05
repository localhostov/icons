package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.ShieldCheck: ImageVector
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
                moveTo(20.0f, 12.0f)
                curveToRelative(0.0f, 5.455f, -6.319f, 9.033f, -8.0f, 9.889f)
                curveToRelative(-1.683f, -0.853f, -8.0f, -4.42f, -8.0f, -9.889f)
                verticalLineTo(6.883f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.052f, 4.037f)
                lineTo(12.0f, 2.054f)
                lineToRelative(5.948f, 1.983f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 20.0f, 6.883f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.3f, 8.3f)
                lineTo(11.112f, 12.5f)
                lineTo(8.868f, 10.16f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.441f, 1.386f)
                lineToRelative(2.306f, 2.4f)
                arcToRelative(1.872f, 1.872f, 0.0f, false, false, 1.345f, 0.6f)
                horizontalLineToRelative(0.033f)
                arcToRelative(1.873f, 1.873f, 0.0f, false, false, 1.335f, -0.553f)
                lineToRelative(4.272f, -4.272f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.3f, 8.3f)
                close()
            }
        }
        .build()
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
