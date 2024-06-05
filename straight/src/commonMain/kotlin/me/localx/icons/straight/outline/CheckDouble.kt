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

public val Icons.Outline.CheckDouble: ImageVector
    get() {
        if (_checkDouble != null) {
            return _checkDouble!!
        }
        _checkDouble = Builder(name = "CheckDouble", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 8.544f)
                lineToRelative(-13.577f, 13.577f)
                curveToRelative(-0.567f, 0.567f, -1.32f, 0.879f, -2.122f, 0.879f)
                horizontalLineToRelative(-0.006f)
                curveToRelative(-0.803f, -0.002f, -1.557f, -0.316f, -2.123f, -0.887f)
                lineTo(0.311f, 16.502f)
                lineToRelative(1.42f, -1.408f)
                lineToRelative(5.569f, 5.611f)
                curveToRelative(0.188f, 0.189f, 0.439f, 0.295f, 0.707f, 0.295f)
                horizontalLineToRelative(0.002f)
                curveToRelative(0.267f, 0.0f, 0.519f, -0.104f, 0.708f, -0.293f)
                lineToRelative(13.577f, -13.577f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(8.011f, 11.981f)
                horizontalLineToRelative(0.017f)
                curveToRelative(0.801f, 0.0f, 1.554f, -0.312f, 2.121f, -0.879f)
                lineTo(18.349f, 2.902f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-8.2f, 8.2f)
                curveToRelative(-0.19f, 0.191f, -0.404f, 0.307f, -0.713f, 0.293f)
                curveToRelative(-0.269f, -0.001f, -0.521f, -0.108f, -0.709f, -0.301f)
                lineTo(3.235f, 5.516f)
                lineToRelative(-1.429f, 1.399f)
                lineToRelative(4.077f, 4.165f)
                curveToRelative(0.565f, 0.577f, 1.32f, 0.897f, 2.127f, 0.902f)
                close()
            }
        }
        .build()
        return _checkDouble!!
    }

private var _checkDouble: ImageVector? = null
