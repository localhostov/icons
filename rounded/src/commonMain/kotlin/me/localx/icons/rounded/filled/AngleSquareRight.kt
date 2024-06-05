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

public val Icons.Filled.AngleSquareRight: ImageVector
    get() {
        if (_angleSquareRight != null) {
            return _angleSquareRight!!
        }
        _angleSquareRight = Builder(name = "AngleSquareRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 5.0f)
                lineTo(0.0f, 19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                lineTo(19.0f, 24.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(24.0f, 5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                lineTo(5.0f, 0.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 0.0f, 5.0f)
                close()
                moveTo(16.0f, 12.0f)
                arcToRelative(2.993f, 2.993f, 0.0f, false, true, -0.752f, 1.987f)
                curveToRelative(-0.291f, 0.327f, -0.574f, 0.637f, -0.777f, 0.84f)
                lineTo(11.647f, 17.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.426f, -1.4f)
                lineTo(13.05f, 13.42f)
                curveToRelative(0.187f, -0.188f, 0.441f, -0.468f, 0.7f, -0.759f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.323f)
                curveToRelative(-0.258f, -0.29f, -0.512f, -0.57f, -0.693f, -0.752f)
                lineTo(10.221f, 7.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.426f, -1.4f)
                lineToRelative(2.829f, 2.879f)
                curveToRelative(0.2f, 0.2f, 0.48f, 0.507f, 0.769f, 0.833f)
                arcTo(2.99f, 2.99f, 0.0f, false, true, 16.0f, 12.0f)
                close()
            }
        }
        .build()
        return _angleSquareRight!!
    }

private var _angleSquareRight: ImageVector? = null
