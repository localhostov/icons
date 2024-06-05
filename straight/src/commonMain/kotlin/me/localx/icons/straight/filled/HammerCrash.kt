package me.localx.icons.straight.filled

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

public val Icons.Filled.HammerCrash: ImageVector
    get() {
        if (_hammerCrash != null) {
            return _hammerCrash!!
        }
        _hammerCrash = Builder(name = "HammerCrash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.2133f, 13.7537f)
                lineToRelative(1.5739f, -1.2324f)
                lineToRelative(1.8495f, 2.3621f)
                lineToRelative(-1.5739f, 1.2324f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.8947f, 10.898f)
                lineToRelative(0.9816f, -1.7425f)
                lineToRelative(2.6147f, 1.4729f)
                lineToRelative(-0.9816f, 1.7425f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.993f, 9.395f)
                lineToRelative(-5.993f, 11.866f)
                lineToRelative(5.398f, 2.739f)
                lineToRelative(5.993f, -11.868f)
                lineToRelative(-5.398f, -2.737f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7f, 10.844f)
                lineToRelative(1.583f, -3.121f)
                curveToRelative(0.499f, -0.983f, 0.104f, -2.189f, -0.879f, -2.688f)
                lineTo(9.864f, 0.702f)
                curveTo(6.67f, -0.918f, 2.749f, 0.361f, 1.127f, 3.558f)
                lineToRelative(-0.453f, 0.892f)
                lineToRelative(14.337f, 7.272f)
                curveToRelative(0.289f, 0.146f, 0.597f, 0.216f, 0.901f, 0.216f)
                curveToRelative(0.729f, 0.0f, 1.435f, -0.4f, 1.787f, -1.095f)
                close()
            }
        }
        .build()
        return _hammerCrash!!
    }

private var _hammerCrash: ImageVector? = null
