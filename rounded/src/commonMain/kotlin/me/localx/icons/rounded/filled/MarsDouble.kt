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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.MarsDouble: ImageVector
    get() {
        if (_marsDouble != null) {
            return _marsDouble!!
        }
        _marsDouble = Builder(name = "MarsDouble", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 11.0f)
                arcToRelative(6.953f, 6.953f, 0.0f, false, false, -1.4f, -4.184f)
                lineToRelative(3.4f, -3.4f)
                verticalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineTo(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(1.586f)
                lineToRelative(-3.4f, 3.4f)
                arcTo(6.991f, 6.991f, 0.0f, true, false, 14.0f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.0f)
                horizontalLineTo(19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(1.586f)
                lineToRelative(-3.413f, 3.413f)
                arcToRelative(6.975f, 6.975f, 0.0f, false, false, -1.189f, -0.736f)
                curveToRelative(0.0f, 0.108f, 0.016f, 0.214f, 0.016f, 0.323f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, true, -9.0f, 9.0f)
                curveToRelative(-0.109f, 0.0f, -0.215f, -0.013f, -0.323f, -0.016f)
                arcTo(6.994f, 6.994f, 0.0f, false, false, 20.0f, 17.0f)
                arcToRelative(6.923f, 6.923f, 0.0f, false, false, -1.411f, -4.175f)
                lineTo(22.0f, 9.414f)
                verticalLineTo(11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 6.0f)
                close()
            }
        }
        .build()
        return _marsDouble!!
    }

private var _marsDouble: ImageVector? = null
