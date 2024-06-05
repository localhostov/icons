package me.localx.icons.straight.filled

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

public val Icons.Filled.PhoneCross: ImageVector
    get() {
        if (_phoneCross != null) {
            return _phoneCross!!
        }
        _phoneCross = Builder(name = "PhoneCross", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.579f, 8.961f)
                lineTo(19.517f, 5.909f)
                lineToRelative(-3.05f, 3.058f)
                lineTo(15.045f, 7.562f)
                lineTo(18.1f, 4.5f)
                lineTo(15.039f, 1.442f)
                lineTo(16.453f, 0.028f)
                curveToRelative(0.227f, 0.227f, 1.531f, 1.528f, 3.06f, 3.052f)
                lineTo(22.564f, 0.021f)
                lineToRelative(1.414f, 1.415f)
                lineTo(20.929f, 4.492f)
                lineToRelative(3.056f, 3.047f)
                close()
                moveTo(13.501f, 16.961f)
                arcToRelative(12.136f, 12.136f, 0.0f, false, true, -6.452f, -6.467f)
                lineToRelative(4.125f, -4.126f)
                lineTo(4.908f, 0.1f)
                lineToRelative(-3.17f, 3.17f)
                arcTo(5.892f, 5.892f, 0.0f, false, false, 0.022f, 7.479f)
                curveToRelative(0.0f, 7.248f, 9.252f, 16.5f, 16.5f, 16.5f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 4.207f, -1.716f)
                lineTo(23.9f, 19.092f)
                lineToRelative(-6.264f, -6.266f)
                close()
            }
        }
        .build()
        return _phoneCross!!
    }

private var _phoneCross: ImageVector? = null
