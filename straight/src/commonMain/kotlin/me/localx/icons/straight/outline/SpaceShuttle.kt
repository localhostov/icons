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

public val Icons.Outline.SpaceShuttle: ImageVector
    get() {
        if (_spaceShuttle != null) {
            return _spaceShuttle!!
        }
        _spaceShuttle = Builder(name = "SpaceShuttle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.822f, 9.054f)
                arcTo(8.6f, 8.6f, 0.0f, false, false, 17.607f, 8.0f)
                lineTo(13.569f, 8.0f)
                lineTo(9.985f, 1.563f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 7.351f, 0.0f)
                lineTo(2.0f, 0.0f)
                lineTo(2.0f, 6.0f)
                lineTo(4.0f, 6.0f)
                lineTo(4.0f, 2.0f)
                lineTo(7.351f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.882f, 0.529f)
                lineTo(11.28f, 8.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(8.0f)
                lineTo(11.28f, 16.0f)
                lineTo(8.229f, 21.479f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.351f, 22.0f)
                lineTo(4.0f, 22.0f)
                lineTo(4.0f, 18.0f)
                lineTo(2.0f, 18.0f)
                verticalLineToRelative(6.0f)
                lineTo(7.351f, 24.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.98f, 22.444f)
                lineTo(13.569f, 16.0f)
                horizontalLineToRelative(4.038f)
                arcToRelative(8.6f, 8.6f, 0.0f, false, false, 4.215f, -1.054f)
                curveTo(24.766f, 13.2f, 24.769f, 10.8f, 21.822f, 9.054f)
                close()
                moveTo(16.728f, 14.0f)
                lineTo(6.0f, 14.0f)
                lineTo(6.0f, 10.0f)
                lineTo(16.727f, 10.0f)
                arcTo(2.225f, 2.225f, 0.0f, false, true, 16.728f, 14.0f)
                close()
                moveTo(2.0f, 10.0f)
                lineTo(4.0f, 10.0f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 14.0f)
                close()
                moveTo(20.842f, 13.2f)
                arcToRelative(5.957f, 5.957f, 0.0f, false, true, -1.24f, 0.517f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -3.44f)
                arcToRelative(5.957f, 5.957f, 0.0f, false, true, 1.24f, 0.517f)
                curveTo(22.371f, 11.677f, 22.371f, 12.323f, 20.842f, 13.2f)
                close()
            }
        }
        .build()
        return _spaceShuttle!!
    }

private var _spaceShuttle: ImageVector? = null
