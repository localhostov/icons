package me.localx.icons.rounded.outline

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

public val Icons.Outline.GrinTongue: ImageVector
    get() {
        if (_grinTongue != null) {
            return _grinTongue!!
        }
        _grinTongue = Builder(name = "GrinTongue", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.893f, 24.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 2.0f, 12.0f)
                curveTo(2.5f, -1.248f, 21.5f, -1.244f, 22.0f, 12.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 12.0f, 22.0f)
                close()
                moveTo(17.0f, 14.0f)
                lineTo(7.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(9.0f, 16.0f)
                verticalLineToRelative(0.6f)
                curveToRelative(0.133f, 4.495f, 5.869f, 4.49f, 6.0f, 0.0f)
                lineTo(15.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 14.0f)
                close()
                moveTo(13.0f, 16.6f)
                curveToRelative(-0.062f, 1.839f, -1.938f, 1.837f, -2.0f, 0.0f)
                lineTo(11.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(7.0f, 9.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 9.5f)
                close()
                moveTo(14.0f, 9.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 9.5f)
                close()
            }
        }
        .build()
        return _grinTongue!!
    }

private var _grinTongue: ImageVector? = null
