package me.localx.icons.rounded.outline

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

public val Icons.Outline.EyeCrossed: ImageVector
    get() {
        if (_eyeCrossed != null) {
            return _eyeCrossed!!
        }
        _eyeCrossed = Builder(name = "EyeCrossed", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.271f, 9.419f)
                arcTo(15.866f, 15.866f, 0.0f, false, false, 19.9f, 5.51f)
                lineToRelative(2.8f, -2.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, -1.414f)
                lineTo(18.241f, 4.345f)
                arcTo(12.054f, 12.054f, 0.0f, false, false, 12.0f, 2.655f)
                curveTo(5.809f, 2.655f, 2.281f, 6.893f, 0.729f, 9.419f)
                arcToRelative(4.908f, 4.908f, 0.0f, false, false, 0.0f, 5.162f)
                arcTo(15.866f, 15.866f, 0.0f, false, false, 4.1f, 18.49f)
                lineToRelative(-2.8f, 2.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, 1.414f)
                lineToRelative(3.052f, -3.052f)
                arcTo(12.054f, 12.054f, 0.0f, false, false, 12.0f, 21.345f)
                curveToRelative(6.191f, 0.0f, 9.719f, -4.238f, 11.271f, -6.764f)
                arcTo(4.908f, 4.908f, 0.0f, false, false, 23.271f, 9.419f)
                close()
                moveTo(2.433f, 13.534f)
                arcToRelative(2.918f, 2.918f, 0.0f, false, true, 0.0f, -3.068f)
                curveTo(3.767f, 8.3f, 6.782f, 4.655f, 12.0f, 4.655f)
                arcTo(10.1f, 10.1f, 0.0f, false, true, 16.766f, 5.82f)
                lineTo(14.753f, 7.833f)
                arcToRelative(4.992f, 4.992f, 0.0f, false, false, -6.92f, 6.92f)
                lineToRelative(-2.31f, 2.31f)
                arcTo(13.723f, 13.723f, 0.0f, false, true, 2.433f, 13.534f)
                close()
                moveTo(15.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                arcToRelative(2.951f, 2.951f, 0.0f, false, true, -1.285f, -0.3f)
                lineTo(14.7f, 10.715f)
                arcTo(2.951f, 2.951f, 0.0f, false, true, 15.0f, 12.0f)
                close()
                moveTo(9.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                arcToRelative(2.951f, 2.951f, 0.0f, false, true, 1.285f, 0.3f)
                lineTo(9.3f, 13.285f)
                arcTo(2.951f, 2.951f, 0.0f, false, true, 9.0f, 12.0f)
                close()
                moveTo(21.567f, 13.534f)
                curveTo(20.233f, 15.7f, 17.218f, 19.345f, 12.0f, 19.345f)
                arcTo(10.1f, 10.1f, 0.0f, false, true, 7.234f, 18.18f)
                lineToRelative(2.013f, -2.013f)
                arcToRelative(4.992f, 4.992f, 0.0f, false, false, 6.92f, -6.92f)
                lineToRelative(2.31f, -2.31f)
                arcToRelative(13.723f, 13.723f, 0.0f, false, true, 3.09f, 3.529f)
                arcTo(2.918f, 2.918f, 0.0f, false, true, 21.567f, 13.534f)
                close()
            }
        }
        .build()
        return _eyeCrossed!!
    }

private var _eyeCrossed: ImageVector? = null
