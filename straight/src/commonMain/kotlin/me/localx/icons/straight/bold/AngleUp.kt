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

public val Icons.Bold.AngleUp: ImageVector
    get() {
        if (_angleUp != null) {
            return _angleUp!!
        }
        _angleUp = Builder(name = "AngleUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 16.0189f)
                    lineTo(9.52f, 6.5129f)
                    curveTo(10.1772f, 5.8588f, 11.0667f, 5.4916f, 11.994f, 5.4916f)
                    curveTo(12.9213f, 5.4916f, 13.8108f, 5.8588f, 14.468f, 6.5129f)
                    lineTo(24.0f, 16.0309f)
                    lineTo(21.879f, 18.1479f)
                    lineTo(12.348f, 8.6299f)
                    curveTo(12.2542f, 8.5362f, 12.1271f, 8.4836f, 11.9945f, 8.4836f)
                    curveTo(11.8619f, 8.4836f, 11.7348f, 8.5362f, 11.641f, 8.6299f)
                    lineTo(2.121f, 18.1369f)
                    lineTo(0.0f, 16.0189f)
                    close()
                }
            }
        }
        .build()
        return _angleUp!!
    }

private var _angleUp: ImageVector? = null
