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

public val Icons.Filled.CallOutgoing: ImageVector
    get() {
        if (_callOutgoing != null) {
            return _callOutgoing!!
        }
        _callOutgoing = Builder(name = "CallOutgoing", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 2.0f)
                verticalLineTo(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(3.439f)
                lineTo(16.7f, 8.71f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 15.3f, 7.292f)
                lineTo(20.61f, 2.0f)
                horizontalLineTo(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 24.0f, 2.0f)
                close()
                moveTo(20.655f, 14.856f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, -4.28f, 0.006f)
                lineToRelative(-1.906f, 1.606f)
                arcTo(12.781f, 12.781f, 0.0f, false, true, 7.537f, 9.524f)
                lineToRelative(1.6f, -1.9f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, 0.006f, -4.28f)
                reflectiveCurveTo(7.291f, 0.939f, 7.261f, 0.907f)
                arcTo(3.085f, 3.085f, 0.0f, false, false, 2.933f, 0.861f)
                lineToRelative(-1.149f, 1.0f)
                curveToRelative(-7.72f, 8.209f, 12.2f, 28.138f, 20.4f, 20.3f)
                lineToRelative(0.912f, -1.049f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, 0.0f, -4.378f)
                curveTo(23.063f, 16.708f, 20.655f, 14.856f, 20.655f, 14.856f)
                close()
            }
        }
        .build()
        return _callOutgoing!!
    }

private var _callOutgoing: ImageVector? = null
