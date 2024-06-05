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

public val Icons.Filled.M: ImageVector
    get() {
        if (_m != null) {
            return _m!!
        }
        _m = Builder(name = "M", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(2.499f)
                curveToRelative(0.0f, -0.257f, -0.087f, -0.415f, -0.257f, -0.468f)
                curveToRelative(-0.151f, -0.047f, -0.383f, -0.017f, -0.552f, 0.222f)
                lineToRelative(-9.191f, 14.103f)
                lineTo(2.791f, 2.226f)
                curveToRelative(-0.149f, -0.212f, -0.382f, -0.241f, -0.534f, -0.195f)
                curveToRelative(-0.17f, 0.054f, -0.257f, 0.211f, -0.257f, 0.468f)
                verticalLineTo(24.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(2.499f)
                curveTo(0.0f, 1.373f, 0.65f, 0.44f, 1.655f, 0.123f)
                curveToRelative(1.032f, -0.323f, 2.153f, 0.07f, 2.792f, 0.983f)
                lineToRelative(7.553f, 11.587f)
                lineTo(19.534f, 1.134f)
                curveToRelative(0.657f, -0.941f, 1.775f, -1.335f, 2.811f, -1.011f)
                curveToRelative(1.005f, 0.317f, 1.655f, 1.25f, 1.655f, 2.376f)
                verticalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _m!!
    }

private var _m: ImageVector? = null
