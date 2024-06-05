package me.localx.icons.straight.outline

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

public val Icons.Outline.IceSkate: ImageVector
    get() {
        if (_iceSkate != null) {
            return _iceSkate!!
        }
        _iceSkate = Builder(name = "IceSkate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(14.1f)
                arcToRelative(6.014f, 6.014f, 0.0f, false, false, -4.823f, -5.883f)
                lineTo(13.3f, 7.44f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.592f, -1.7f)
                lineTo(11.3f, 2.576f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 7.619f, 0.086f)
                lineTo(0.0f, 2.244f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                close()
                moveTo(2.0f, 3.756f)
                lineTo(8.107f, 2.024f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.207f, 0.824f)
                lineTo(9.466f, 4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.729f)
                arcToRelative(3.958f, 3.958f, 0.0f, false, false, 0.245f, 0.915f)
                lineTo(7.635f, 8.338f)
                lineToRelative(1.039f, 1.709f)
                lineToRelative(2.466f, -1.5f)
                arcToRelative(3.964f, 3.964f, 0.0f, false, false, 0.853f, 0.538f)
                lineToRelative(-1.355f, 2.307f)
                lineToRelative(1.724f, 1.013f)
                lineTo(14.0f, 9.62f)
                lineToRelative(2.784f, 0.557f)
                arcTo(4.01f, 4.01f, 0.0f, false, true, 20.0f, 14.1f)
                verticalLineTo(16.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(7.0f, 18.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _iceSkate!!
    }

private var _iceSkate: ImageVector? = null
