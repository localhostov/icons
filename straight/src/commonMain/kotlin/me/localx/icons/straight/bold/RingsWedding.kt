package me.localx.icons.straight.bold

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
import me.localx.icons.straight.Icons

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
                moveTo(16.0f, 8.0f)
                arcToRelative(7.964f, 7.964f, 0.0f, false, false, -5.087f, 1.83f)
                arcToRelative(7.419f, 7.419f, 0.0f, false, false, -1.952f, -0.685f)
                lineTo(10.333f, 6.4f)
                lineTo(9.0f, 5.0f)
                horizontalLineTo(6.0f)
                lineTo(4.733f, 6.4f)
                lineTo(6.1f, 9.136f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, false, 5.58f, 13.587f)
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.1838f, 2.9395f)
                lineToRelative(2.2884f, -2.288f)
                lineToRelative(2.1211f, 2.1215f)
                lineToRelative(-2.2884f, 2.288f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.4729f, 2.7732f)
                lineToRelative(2.1213f, -2.1213f)
                lineToRelative(2.25f, 2.25f)
                lineToRelative(-2.1213f, 2.1213f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _ringsWedding!!
    }

private var _ringsWedding: ImageVector? = null
