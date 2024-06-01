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

public val Icons.Filled.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 14.9918f)
                    curveTo(10.3432f, 14.9918f, 9.0f, 16.335f, 9.0f, 17.9918f)
                    verticalLineTo(23.9918f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(17.9918f)
                    curveTo(15.0f, 16.335f, 13.6568f, 14.9918f, 12.0f, 14.9918f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.0f, 17.9923f)
                    verticalLineTo(23.9923f)
                    horizontalLineTo(21.0f)
                    curveTo(22.6568f, 23.9923f, 24.0f, 22.6491f, 24.0f, 20.9923f)
                    verticalLineTo(11.8713f)
                    curveTo(24.0002f, 11.3518f, 23.7983f, 10.8525f, 23.437f, 10.4793f)
                    lineTo(14.939f, 1.2922f)
                    curveTo(13.4396f, -0.3301f, 10.9089f, -0.4297f, 9.2865f, 1.0697f)
                    curveTo(9.2095f, 1.141f, 9.1352f, 1.2152f, 9.064f, 1.2922f)
                    lineTo(0.581f, 10.4763f)
                    curveTo(0.2087f, 10.8511f, -1.0E-4f, 11.358f, 0.0f, 11.8863f)
                    verticalLineTo(20.9923f)
                    curveTo(0.0f, 22.6491f, 1.3432f, 23.9923f, 3.0f, 23.9923f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(17.9923f)
                    curveTo(7.0187f, 15.2654f, 9.2203f, 13.0387f, 11.8784f, 12.9746f)
                    curveTo(14.6255f, 12.9083f, 16.9791f, 15.173f, 17.0f, 17.9923f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 14.9918f)
                    curveTo(10.3432f, 14.9918f, 9.0f, 16.335f, 9.0f, 17.9918f)
                    verticalLineTo(23.9918f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(17.9918f)
                    curveTo(15.0f, 16.335f, 13.6568f, 14.9918f, 12.0f, 14.9918f)
                    close()
                }
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
