package me.localx.icons.rounded.filled

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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Sphere: ImageVector
    get() {
        if (_sphere != null) {
            return _sphere!!
        }
        _sphere = Builder(name = "Sphere", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 6.0f)
                    curveTo(18.841f, 6.0f, 24.0f, 8.579f, 24.0f, 12.0f)
                    curveTo(24.0f, 8.8174f, 22.7357f, 5.7652f, 20.4853f, 3.5147f)
                    curveTo(18.2348f, 1.2643f, 15.1826f, 0.0f, 12.0f, 0.0f)
                    curveTo(8.8174f, 0.0f, 5.7652f, 1.2643f, 3.5147f, 3.5147f)
                    curveTo(1.2643f, 5.7652f, 0.0f, 8.8174f, 0.0f, 12.0f)
                    curveTo(0.0f, 8.579f, 5.159f, 6.0f, 12.0f, 6.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0001f, 16.0006f)
                    curveTo(17.5229f, 16.0006f, 22.0001f, 14.2097f, 22.0001f, 12.0006f)
                    curveTo(22.0001f, 9.7915f, 17.5229f, 8.0006f, 12.0001f, 8.0006f)
                    curveTo(6.4772f, 8.0006f, 2.0001f, 9.7915f, 2.0001f, 12.0006f)
                    curveTo(2.0001f, 14.2097f, 6.4772f, 16.0006f, 12.0001f, 16.0006f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 18.0f)
                    curveTo(5.159f, 18.0f, 0.0f, 15.421f, 0.0f, 12.0f)
                    curveTo(0.0f, 15.1826f, 1.2643f, 18.2348f, 3.5147f, 20.4853f)
                    curveTo(5.7652f, 22.7357f, 8.8174f, 24.0f, 12.0f, 24.0f)
                    curveTo(15.1826f, 24.0f, 18.2348f, 22.7357f, 20.4853f, 20.4853f)
                    curveTo(22.7357f, 18.2348f, 24.0f, 15.1826f, 24.0f, 12.0f)
                    curveTo(24.0f, 15.421f, 18.841f, 18.0f, 12.0f, 18.0f)
                    close()
                }
            }
        }
        .build()
        return _sphere!!
    }

private var _sphere: ImageVector? = null
