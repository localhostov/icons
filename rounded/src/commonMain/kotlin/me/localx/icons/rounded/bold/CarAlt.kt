package me.localx.icons.rounded.bold

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

public val Icons.Bold.CarAlt: ImageVector
    get() {
        if (_carAlt != null) {
            return _carAlt!!
        }
        _carAlt = Builder(name = "CarAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 6.0f)
                horizontalLineToRelative(-0.139f)
                arcToRelative(31.079f, 31.079f, 0.0f, false, false, -1.918f, -2.8f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, -2.255f, -1.538f)
                curveTo(15.449f, 0.842f, 8.55f, 0.842f, 6.812f, 1.666f)
                arcTo(4.409f, 4.409f, 0.0f, false, false, 4.556f, 3.2f)
                arcTo(30.858f, 30.858f, 0.0f, false, false, 2.639f, 6.0f)
                horizontalLineTo(2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 0.0f, 8.5f)
                verticalLineToRelative(7.0f)
                arcToRelative(4.494f, 4.494f, 0.0f, false, false, 3.0f, 4.224f)
                verticalLineTo(21.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                verticalLineTo(19.724f)
                arcTo(4.493f, 4.493f, 0.0f, false, false, 24.0f, 15.5f)
                verticalLineToRelative(-7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.5f, 6.0f)
                close()
                moveTo(6.926f, 5.043f)
                arcToRelative(1.431f, 1.431f, 0.0f, false, true, 0.734f, -0.5f)
                curveToRelative(1.385f, -0.673f, 7.3f, -0.673f, 8.681f, 0.0f)
                arcToRelative(1.422f, 1.422f, 0.0f, false, true, 0.731f, 0.5f)
                arcToRelative(27.6f, 27.6f, 0.0f, false, true, 2.045f, 3.039f)
                curveToRelative(0.052f, 0.124f, 0.972f, 1.791f, 1.3f, 2.543f)
                arcToRelative(62.184f, 62.184f, 0.0f, false, false, -16.839f, 0.0f)
                curveToRelative(0.329f, -0.75f, 1.251f, -2.419f, 1.3f, -2.546f)
                arcTo(27.526f, 27.526f, 0.0f, false, true, 6.926f, 5.043f)
                close()
                moveTo(19.5f, 17.0f)
                horizontalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 15.5f)
                verticalLineTo(13.715f)
                curveToRelative(0.068f, 0.0f, 1.31f, -0.162f, 2.0f, -0.243f)
                verticalLineTo(14.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineTo(13.177f)
                arcToRelative(46.665f, 46.665f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineTo(14.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineTo(13.472f)
                curveToRelative(0.69f, 0.081f, 1.932f, 0.236f, 2.0f, 0.236f)
                verticalLineTo(15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 17.0f)
                close()
            }
        }
        .build()
        return _carAlt!!
    }

private var _carAlt: ImageVector? = null
