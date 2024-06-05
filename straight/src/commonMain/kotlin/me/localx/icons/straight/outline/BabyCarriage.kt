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

public val Icons.Outline.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) {
            return _babyCarriage!!
        }
        _babyCarriage = Builder(name = "BabyCarriage", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 0.0f)
                lineTo(13.0f, 0.0f)
                lineTo(13.0f, 9.0f)
                lineTo(5.414f, 9.0f)
                lineTo(4.121f, 7.707f)
                arcTo(5.787f, 5.787f, 0.0f, false, false, 0.0f, 6.0f)
                lineTo(0.0f, 8.0f)
                arcTo(3.8f, 3.8f, 0.0f, false, true, 2.707f, 9.121f)
                lineTo(4.0f, 10.414f)
                lineTo(4.0f, 13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(4.865f)
                lineTo(9.257f, 19.129f)
                curveTo(5.576f, 18.113f, 4.685f, 23.824f, 8.5f, 24.0f)
                arcToRelative(2.506f, 2.506f, 0.0f, false, false, 2.261f, -3.551f)
                lineTo(14.0f, 16.562f)
                lineToRelative(3.239f, 3.887f)
                arcTo(2.506f, 2.506f, 0.0f, false, false, 19.5f, 24.0f)
                curveToRelative(3.816f, -0.177f, 2.923f, -5.887f, -0.757f, -4.871f)
                lineTo(16.135f, 16.0f)
                lineTo(21.0f, 16.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(24.0f, 10.0f)
                curveTo(24.0f, 0.114f, 15.09f, 0.0f, 15.0f, 0.0f)
                close()
                moveTo(15.0f, 2.0f)
                arcToRelative(7.081f, 7.081f, 0.0f, false, true, 6.961f, 7.0f)
                lineTo(15.0f, 9.0f)
                close()
                moveTo(22.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(7.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(6.0f, 11.0f)
                lineTo(22.0f, 11.0f)
                close()
            }
        }
        .build()
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
