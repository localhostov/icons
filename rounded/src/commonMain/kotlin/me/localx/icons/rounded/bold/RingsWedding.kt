package me.localx.icons.rounded.bold

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

public val Icons.Bold.RingsWedding: ImageVector
    get() {
        if (_ringsWedding != null) {
            return _ringsWedding!!
        }
        _ringsWedding = Builder(name = "RingsWedding", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.156f, 3.167f)
                lineToRelative(0.5f, 1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.34f, 2.833f)
                lineToRelative(-0.5f, -1.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 1.156f, 3.167f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.161f, 1.825f)
                lineToRelative(-0.5f, 1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.678f, 1.35f)
                lineToRelative(0.5f, -1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.678f, -1.35f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 1.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcToRelative(7.964f, 7.964f, 0.0f, false, false, -5.087f, 1.83f)
                arcToRelative(7.344f, 7.344f, 0.0f, false, false, -1.3f, -0.522f)
                lineToRelative(0.736f, -1.473f)
                arcToRelative(1.73f, 1.73f, 0.0f, false, false, -0.688f, -2.272f)
                arcTo(4.245f, 4.245f, 0.0f, false, false, 7.5f, 5.0f)
                arcToRelative(4.217f, 4.217f, 0.0f, false, false, -2.295f, 0.646f)
                arcToRelative(1.691f, 1.691f, 0.0f, false, false, -0.556f, 2.183f)
                lineToRelative(0.74f, 1.479f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, false, 6.292f, 13.415f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 16.0f, 8.0f)
                close()
                moveTo(3.0f, 16.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 7.5f, 12.0f)
                arcToRelative(4.436f, 4.436f, 0.0f, false, true, 1.435f, 0.256f)
                arcToRelative(7.961f, 7.961f, 0.0f, false, false, 0.493f, 8.293f)
                arcTo(4.447f, 4.447f, 0.0f, false, true, 7.5f, 21.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 3.0f, 16.5f)
                close()
                moveTo(16.0f, 21.0f)
                arcToRelative(4.931f, 4.931f, 0.0f, false, true, -2.16f, -0.511f)
                arcToRelative(7.457f, 7.457f, 0.0f, false, false, -0.512f, -8.7f)
                arcTo(4.995f, 4.995f, 0.0f, true, true, 16.0f, 21.0f)
                close()
            }
        }
        .build()
        return _ringsWedding!!
    }

private var _ringsWedding: ImageVector? = null
