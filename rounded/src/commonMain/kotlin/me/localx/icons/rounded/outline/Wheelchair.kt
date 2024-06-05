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

public val Icons.Outline.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) {
            return _wheelchair!!
        }
        _wheelchair = Builder(name = "Wheelchair", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 21.0f)
                horizontalLineTo(21.721f)
                lineTo(20.4f, 17.051f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 17.559f, 15.0f)
                horizontalLineTo(14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.0f)
                arcToRelative(1.026f, 1.026f, 0.0f, false, false, -0.027f, -0.134f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -1.946f, 0.0f)
                arcTo(1.026f, 1.026f, 0.0f, false, false, 10.0f, 8.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.911f, 3.991f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -6.769f, -6.929f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.284f, -1.981f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 15.931f, 17.0f)
                horizontalLineToRelative(1.628f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.949f, 0.684f)
                lineToRelative(1.544f, 4.632f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 23.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(9.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 4.0f)
                close()
            }
        }
        .build()
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
