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

public val Icons.Filled.Aubergine: ImageVector
    get() {
        if (_aubergine != null) {
            return _aubergine!!
        }
        _aubergine = Builder(name = "Aubergine", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.24f, 4.915f)
                arcToRelative(8.325f, 8.325f, 0.0f, false, false, 3.315f, -1.083f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.1f, -1.668f)
                arcTo(6.508f, 6.508f, 0.0f, false, true, 20.0f, 2.931f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(2.931f)
                arcToRelative(6.526f, 6.526f, 0.0f, false, true, -2.451f, -0.767f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.1f, 1.668f)
                arcTo(8.343f, 8.343f, 0.0f, false, false, 17.794f, 4.92f)
                curveToRelative(-2.021f, 0.523f, -3.008f, 1.888f, -3.832f, 3.823f)
                curveTo(13.0f, 11.0f, 11.0f, 11.0f, 7.0f, 11.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 2.641f, -7.0f, 6.5f)
                reflectiveCurveTo(3.14f, 24.0f, 7.0f, 24.0f)
                curveToRelative(10.645f, 0.0f, 17.0f, -7.5f, 17.0f, -14.257f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 20.24f, 4.915f)
                close()
                moveTo(19.0f, 8.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(4.95f)
                arcToRelative(10.126f, 10.126f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(7.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 8.5f)
                close()
            }
        }
        .build()
        return _aubergine!!
    }

private var _aubergine: ImageVector? = null
