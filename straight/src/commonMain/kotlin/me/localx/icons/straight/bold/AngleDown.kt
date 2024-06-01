package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.AngleDown: ImageVector
    get() {
        if (_angleDown != null) {
            return _angleDown!!
        }
        _angleDown = Builder(name = "AngleDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 8.057f)
                    lineTo(9.52f, 17.564f)
                    curveTo(10.1772f, 18.2181f, 11.0667f, 18.5853f, 11.994f, 18.5853f)
                    curveTo(12.9213f, 18.5853f, 13.8108f, 18.2181f, 14.468f, 17.564f)
                    lineTo(24.0f, 8.0459f)
                    lineTo(21.879f, 5.929f)
                    lineTo(12.348f, 15.446f)
                    curveTo(12.2542f, 15.5397f, 12.1271f, 15.5923f, 11.9945f, 15.5923f)
                    curveTo(11.8619f, 15.5923f, 11.7348f, 15.5397f, 11.641f, 15.446f)
                    lineTo(2.121f, 5.94f)
                    lineTo(0.0f, 8.057f)
                    close()
                }
            }
        }
        .build()
        return _angleDown!!
    }

private var _angleDown: ImageVector? = null
