package me.localx.icons.straight.bold

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

public val Icons.Bold.MusicNoteSlash: ImageVector
    get() {
        if (_musicNoteSlash != null) {
            return _musicNoteSlash!!
        }
        _musicNoteSlash = Builder(name = "MusicNoteSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.961f, 21.84f)
                lineToRelative(-2.121f, 2.121f)
                lineTo(0.039f, 2.16f)
                lineTo(2.16f, 0.039f)
                lineToRelative(9.84f, 9.84f)
                lineTo(12.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(9.879f)
                lineToRelative(8.961f, 8.961f)
                close()
                moveTo(8.21f, 13.159f)
                lineToRelative(6.631f, 6.631f)
                curveToRelative(-0.583f, 2.411f, -2.753f, 4.21f, -5.341f, 4.21f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                curveToRelative(0.0f, -2.587f, 1.799f, -4.758f, 4.21f, -5.341f)
                close()
                moveTo(9.5f, 16.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.122f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.121f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.122f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _musicNoteSlash!!
    }

private var _musicNoteSlash: ImageVector? = null
