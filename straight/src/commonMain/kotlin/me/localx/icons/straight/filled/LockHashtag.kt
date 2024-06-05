package me.localx.icons.straight.filled

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

public val Icons.Filled.LockHashtag: ImageVector
    get() {
        if (_lockHashtag != null) {
            return _lockHashtag!!
        }
        _lockHashtag = Builder(name = "LockHashtag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.765f, 17.0f)
                lineToRelative(0.235f, -2.0f)
                horizontalLineToRelative(-1.958f)
                lineToRelative(0.24f, -2.0f)
                horizontalLineToRelative(-2.012f)
                lineToRelative(-0.24f, 2.0f)
                horizontalLineToRelative(-3.155f)
                lineToRelative(0.24f, -2.0f)
                horizontalLineToRelative(-2.012f)
                lineToRelative(-0.24f, 2.0f)
                horizontalLineToRelative(-2.363f)
                lineToRelative(-0.235f, 2.0f)
                horizontalLineToRelative(2.358f)
                lineToRelative(-0.36f, 3.0f)
                horizontalLineToRelative(-2.2f)
                lineToRelative(-0.235f, 2.0f)
                horizontalLineToRelative(2.195f)
                lineToRelative(-0.24f, 2.0f)
                horizontalLineToRelative(2.012f)
                lineToRelative(0.24f, -2.0f)
                horizontalLineToRelative(3.155f)
                lineToRelative(-0.24f, 2.0f)
                horizontalLineToRelative(2.012f)
                lineToRelative(0.24f, -2.0f)
                horizontalLineToRelative(2.126f)
                lineToRelative(0.235f, -2.0f)
                horizontalLineToRelative(-2.121f)
                lineToRelative(0.36f, -3.0f)
                horizontalLineToRelative(1.963f)
                close()
                moveTo(19.43f, 20.0f)
                horizontalLineToRelative(-3.155f)
                lineToRelative(0.36f, -3.0f)
                horizontalLineToRelative(3.155f)
                lineToRelative(-0.36f, 3.0f)
                close()
                moveTo(20.0f, 8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.86f, -3.14f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveTo(3.0f, 3.14f, 3.0f, 7.0f)
                verticalLineToRelative(1.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(13.5f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(7.078f)
                lineToRelative(0.769f, -6.0f)
                horizontalLineToRelative(-1.347f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.859f)
                lineToRelative(0.384f, -3.0f)
                horizontalLineToRelative(8.756f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(15.0f, 8.0f)
                lineTo(5.0f, 8.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _lockHashtag!!
    }

private var _lockHashtag: ImageVector? = null
